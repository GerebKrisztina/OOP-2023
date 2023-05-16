package oop.labor10.lab10;

public class CircularQueue implements IQueue{
    private final int CAPACITY;
    private Object[] items;

    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    public boolean isFull(){
        if(rear==front-1){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        CircularQueue that = (CircularQueue) o;
        if(this.CAPACITY != that.CAPACITY) return false;
        int i = this.front, j = that.front;
        do {
            if(this.items[i] != that.items[j]) return false;
            i=(i+1)%CAPACITY;
            j=(j+1)%CAPACITY;
        }while (i != this.rear);
        if(j != that.rear) return false;
        return false;
    }
}
