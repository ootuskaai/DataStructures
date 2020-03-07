package com.company;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count;

    public PriorityQueue(int len) {
        if(len <= 0)
            throw new IllegalArgumentException();
        items = new int[len];
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public void enqueue(int item) {
        if(isFull())
            throw new IllegalStateException();

        int idx = shiftItemsToInsert(item);
        items[idx] = item;
        count++;
    }

    public int shiftItemsToInsert(int item) {
        int idx;
        for (idx = count - 1; idx >= 0; idx--) {
            if(items[idx] > item)
                items[idx + 1] = items[idx];
            else
                break;
        }
        return idx + 1;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }
}
