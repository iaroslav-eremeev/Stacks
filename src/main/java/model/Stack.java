package model;

import java.util.ArrayList;

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
            return "Entry{" +
                    "value=" + value +
                    "}\n";
        }
    }

    private Entry top;
    private int count;

    public void put(T value){
        this.top = new Entry(value, this.top);
        this.count++;
    }

    public void get(){
        T value = this.top.value;
        this.top = this.top.prev;
        this.count--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack{\n");
        Entry entry = this.top;
        while (entry.prev != null){
            sb.append(entry);
            entry = entry.prev;
        }
        sb.append(entry);
        sb.append("}");
        return sb.toString();
    }
}
