package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "abcd";
        StringReverser reverser = new StringReverser();
        String ss =  reverser.reverse2(str);
        System.out.println(ss);
//        String ans = reverser.reverse(str);
//        System.out.println(ans);
    }
}
