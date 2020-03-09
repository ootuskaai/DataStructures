package com.company;


import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        String s = "0";
        System.out.println(s.hashCode());
    }

    public static int hash(String key) {
        int hash = 0;
        for (char ch: key.toCharArray())
            hash += ch;
        return hash % 100;
    }
}
