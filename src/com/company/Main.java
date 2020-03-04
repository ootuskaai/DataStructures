package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        boolean b = list.contains(50);
    }
}
