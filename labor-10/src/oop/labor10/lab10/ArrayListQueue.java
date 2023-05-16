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
        return items.size()==0;
    }

    @Override
    public boolean isFull() {
        return this.CAPACITY== items.size();
    }

    @Override
    public void enQueue(Object obj) {
        if(!isFull()){
            items.add(o);
        }
    }

    @Override
    public Object deQueue() {
        if(!isEmpty()){
            Object obj = items.get(0);
            items.remove(0);
            return obj;
        }
        return null;
    }

    @Override
    public void printQueue() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o== null || getClass()!=o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        if(this.items.size() != that.items.size()) return false;
        for (int i = 0; i<this.items.size();i++){
            if(this.items.get(i).equals(that.items.get(i))) return false;
        }
        return true;
    }


}
