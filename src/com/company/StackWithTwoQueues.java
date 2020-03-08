package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithTwoQueues {
    private Queue<Integer> queue1 = new ArrayDeque<>();
    private Queue<Integer> queue2 = new ArrayDeque<>();
    private int top;

    //O(1)
    public void push(int item) {
        queue1.add(item);
        top = item;
    }

    //O(n)
    public int pop() {
        if(isEmpty())
            throw new IllegalStateException();

        while (queue1.size() > 1)
            queue2.add(queue1.remove());

        int val = queue1.remove();
        swapQueues();
        return val;
    }

    //O(1)
    public int peek() {
        return top;
    }

    //O(1)
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    //O(1)
    private void swapQueues() {
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
}
