package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        boolean isEmpty = arrayQueue.isEmpty();
        boolean isFull = arrayQueue.isFull();
    }
}
