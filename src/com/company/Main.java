package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //Edge cases
        Expression exp = new Expression();
        String str = "(1 + 2)";
        boolean b = exp.isBalance(str);
        System.out.println(b);
    }
}
