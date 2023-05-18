package oop.labor08.lab8_1.account;

import java.util.ArrayList;

public class StackAggregation {
    private ArrayList<Object> items = new ArrayList<>();
    private final int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }
    public boolean isEmpty() {
        if(items==null) {
            return true;
        }
        else return false;
    }
    public boolean isFull() {
        if(items==null) {
            return false;
        }
        else return true;
    }
    public void push(Object o) {
        items.add(o);
    }

}
