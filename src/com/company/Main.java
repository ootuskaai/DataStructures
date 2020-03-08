package com.company;


import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        StackWithTwoQueues sq = new StackWithTwoQueues();
        sq.push(10);
        sq.push(20);
        sq.push(30);
        sq.pop();
        sq.pop();
        int a = sq.peek();
        System.out.println(a);

        sq.push(40);
        int b = sq.peek();
        System.out.println(b);
    }
}
