package oop.labor10.lab10;

public interface IQueue {
    boolean isEmpty();
    boolean isFull();
    void enQueue(Object obj);
    Object deQueue();
    void printQueue();


}
