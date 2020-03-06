package com.company;

import java.util.Arrays;

public class TwoStacks2 {
    private int[] items;
    private int top1;
    private int top2;

    public TwoStacks2(int capacity) {
        if(capacity <= 0)
            throw new IllegalArgumentException("capacity must be 1 or greater.");
        items = new int[capacity];
        top1 = -1;
        top2 = -2;
    }

    @Override
    public String toString() {
        if(top1 < 0 || top2 < 0) return "empty now";

        int to = top1 > top2 ? top1 + 1 : top2 + 1;
        int[] content = Arrays.copyOfRange(items,0, to);
        return Arrays.toString(content);
    }

    public void push1(int item) {
        if(isFull(top1))
            throw new StackOverflowError();
        items[top1 += 2] = item;
    }

    public void push2(int item) {
        if (isFull(top2))
            throw new StackOverflowError();
        items[top2 += 2] = item;
    }

    public int pop1() {
        if (isEmpty())
            throw new IllegalStateException();
        int item = items[top1];
        top1 -= 2;
        return item;
    }

    public int pop2() {
        if (isEmpty())
            throw new IllegalStateException();
        int item = items[top2];
        top2 -= 2;
        return item;
    }

    public boolean isEmpty() {
        return top1 == -1 && top2 == -2;
    }

    private boolean isFull(int point) {
        return point > items.length - 1;
    }
}
