package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TwoStacks twoStacks = new TwoStacks(5);
        twoStacks.push1(10);
        twoStacks.push2(20);
        int a = twoStacks.pop1();
        int a2 = twoStacks.pop2();

        System.out.println("a: " + a);
        System.out.println("a2: " + a2);

        boolean b = twoStacks.isEmpty();
        System.out.println("b: " + b);

        String s = twoStacks.toString();
        System.out.println(s);
    }
}
