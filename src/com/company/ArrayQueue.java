package com.company;

import java.util.Arrays;

public class ArrayQueue {
    //ArrayQueue (ArrayDeque)
    private int[] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueue(int capacity) {
        if(capacity <= 0)
            throw new IllegalArgumentException("capacity need greater than 0");
        items = new int[capacity];
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException("capacity is full");

        items[rear] = item;
        rear = (rear + 1 ) % items.length;
        count++;
    }

    public int dequeue() {
        if(isEmpty())
            throw new IllegalStateException("queue is empty now");

        int item = items[front];
        items[front] = 0;
        front = (front + 1 ) % items.length;
        count--;
        return item;
    }

    public int peek() {
        if(count == 0)
            throw new IllegalStateException("queue is empty now");
        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }
}
