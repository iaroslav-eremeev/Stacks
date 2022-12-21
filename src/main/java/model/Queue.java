package model;

public class Queue<T> {
    class Entry{
        private T value;
        private Entry prev;
        private Entry next;

        public Entry(T value, Entry prev) {
            this.value = value;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "value=" + value +
                    "}\n";
        }
    }

    private Entry last;
    private Entry first;
    private int count;

    public void put(T value){
        if (this.count == 0) {
            this.first = new Entry(value, this.first);
            this.last = this.first;
        }
        else {
            this.last.next = new Entry(value, this.last);
            this.last = this.last.next;
        }
        this.count++;
    }

    public void get(){
        this.first = this.first.next;
        this.first.prev = null;
        this.count--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue{\n");
        Queue.Entry entry = this.last;
        while (entry.prev != null){
            sb.append(entry);
            entry = entry.prev;
        }
        sb.append(entry);
        sb.append("}");
        return sb.toString();
    }
}
