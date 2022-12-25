package model;

public class Stack<T> {
    class Entry{
        private T value;
        private Entry prev;

        public Entry(T value, Entry prev) {
            this.value = value;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return value + "\n";
        }
    }

    private Entry last;
    private int count;

    public void put(T value){
        this.last = new Entry(value, this.last);
        this.count++;
    }

    public void pop(){
        this.last = this.last.prev;
        this.count--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack{\n");
        Entry entry = this.last;
        while (entry.prev != null){
            sb.append(entry);
            entry = entry.prev;
        }
        sb.append(entry);
        sb.append("}");
        return sb.toString();
    }
}
