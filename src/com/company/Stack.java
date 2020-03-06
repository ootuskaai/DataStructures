package com.company;

import java.util.Arrays;

public class Stack {
    private int[] items;
    private int count;

    public Stack(int len) {
        if(len <= 0)
            throw new IllegalArgumentException();
        items = new int[len];
    }

    @Override
    public String toString() {
        int[] content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

    public void push(int item) {
        if(count == items.length)
            throw new StackOverflowError();
        items[count++] = item;
    }

    public int pop() {
        if(count == 0)
            throw new IllegalStateException();
        return items[--count];
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException();
        return items[count];
    }


}
