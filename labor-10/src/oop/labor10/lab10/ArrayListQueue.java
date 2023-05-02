package oop.labor10.lab10;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue{

    private ArrayList<Object> items;
    private final int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new ArrayList<>(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void enQueue(Object obj) {

    }

    @Override
    public Object deQueue() {
        return null;
    }

    @Override
    public void printQueue() {

    }
}
