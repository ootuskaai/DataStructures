package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);
        arrayQueue.enqueue(60);
        arrayQueue.enqueue(70);
        arrayQueue.dequeue();
        arrayQueue.enqueue(80);
        String s = arrayQueue.toString();
        System.out.println(s);
    }
}
