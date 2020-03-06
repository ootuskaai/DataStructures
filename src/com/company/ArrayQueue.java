package com.company;

import java.util.Arrays;

public class ArrayQueue {
    //ArrayQueue (ArrayDeque)

    private int[] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if(count == items.length)
            throw new IllegalStateException("capacity full");

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        if(count == 0)
            throw new IllegalStateException();

        int item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
