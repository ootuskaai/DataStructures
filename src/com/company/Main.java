package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLsat(10);
        list.addFirst(20);
        list.addLsat(30);
        list.addFirst(40);
        list.addLsat(50);
        list.addFirst(60);
        list.removeLast();
        list.removeFirst();
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(70));
        System.out.println("---contains---");
        System.out.println(list.contains(10));
        System.out.println(list.contains(70));
    }
}
