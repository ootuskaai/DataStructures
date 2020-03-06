package com.company;

import java.util.Arrays;

public class Stack {
    int[] items = new int[5];
    int count;

    public void push(int item) {
        if(count == items.length)
            throw new StackOverflowError();
        items[count++] = item;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException();
        return items[--count];
    }

    @Override
    public String toString() {
        int[] content = Arrays.copyOfRange(items,0,count);
        return Arrays.toString(content);
    }
}
