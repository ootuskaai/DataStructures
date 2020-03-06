package com.company;

import java.util.Stack;

public class StringReverser {


    public String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for (char ch: input.toCharArray())
            stack.push(ch);

        StringBuffer buffer = new StringBuffer();
        while (!stack.empty())
            buffer.append(stack.pop());

        return buffer.toString();
    }

    //reverse no stack way
    public String reverse2(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        StringBuffer buffer = new StringBuffer();
        for (int i = input.length() - 1;i >= 0; i--)
            buffer.append(input.toCharArray()[i]);

        return buffer.toString();

    }

}
