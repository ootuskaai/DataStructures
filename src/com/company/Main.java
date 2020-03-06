package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        String s = stack.toString();
        System.out.println(s);
    }
}
