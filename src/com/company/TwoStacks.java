package com.company;

import java.util.Arrays;

public class TwoStacks {
    private int[] items;
    private int top1;
    private int top2;

    public TwoStacks(int capacity) {
        if(capacity <= 0)
            throw new IllegalArgumentException("capacity must be 1 or greater.");
        items = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public void push1(int item) {
        if(isFull1())
            throw new StackOverflowError();
        items[++top1] = item;
    }

    public void push2(int item) {
        if (isFull2())
            throw new StackOverflowError();
        items[--top2] = item;
    }

    public int pop1() {
        if (isEmpty1())
            throw new IllegalStateException();
        return items[top1--];
    }

    public int pop2() {
        if (isEmpty2())
            throw new IllegalStateException();
        return items[top2++];
    }

    public int peek1() {
        if (isEmpty1())
            throw new IllegalStateException();
        return items[top1];
    }

    public int peek2() {
        if(isEmpty2())
            throw new IllegalStateException();
        return items[top2];
    }

    public boolean isEmpty1() {
        return top1 == -1;
    }

    public boolean isEmpty2() {
        return top2 == items.length;
    }

    private boolean isFull1() {
        return top1 + 1 == top2;
    }

    public boolean isFull2() {
        return top2 - 1 == top1;
    }

}
