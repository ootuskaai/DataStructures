package com.company;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {

    public static Queue<Integer> reverse(Queue<Integer> queue, int k) {
        if(k < 0 || k > queue.size())
            throw new IllegalArgumentException();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k;i++)
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());

        for (int i = 0;i < queue.size() - k; i++)
            queue.add(queue.remove());

        return queue;
    }
}
