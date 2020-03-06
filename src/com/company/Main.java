package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TwoStacks stacks = new TwoStacks(5);
        stacks.push1(10);
        stacks.push1(10);
        stacks.push1(10);
        stacks.push2(1);
        stacks.push2(2);

        int a = stacks.pop2();
        System.out.println("a: " + a);

        stacks.push2(3);
        System.out.println(stacks.toString());
    }
}
