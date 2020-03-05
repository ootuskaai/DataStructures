package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addLsat(10);
        list.addLsat(20);
        list.addLsat(30);
        list.addLsat(40);
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));
    }
}
