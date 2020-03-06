package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TwoStacks stacks = new TwoStacks(5);
        stacks.push1(10);
        stacks.push1(20);
        stacks.push1(30);
        stacks.push2(1);
        stacks.push2(2);

        int a = stacks.peek1();
        System.out.println("a: " + a);

        System.out.println(stacks.toString());
    }
}
