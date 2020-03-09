package com.company;


import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        HashTable map = new HashTable(5);
        map.put(6, "A");//1 A
        map.put(8,"B");//3 B
        map.put(11,"C");//1 C
        map.put(6, "A+");
        System.out.println(map.get(6));
        System.out.println(map.get(8));
        System.out.println(map.get(10));
        System.out.println(map.get(-3));
        System.out.println(map.get(0));
    }
}
