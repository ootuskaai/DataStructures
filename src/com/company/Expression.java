package com.company;

import java.util.Stack;

public class Expression {



    //version 2 ting
    public boolean balanced2(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        //input = "(([1] + <2>)) [a]"
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[' || ch == '<') {
                stack.push(ch);
            }
            else if (ch == ')') {
                if(stack.pop() != '(') return false;
            }
            else if (ch == '}') {
                if(stack.pop() != '{') return false;
            }
            else if(ch == ']') {
                if(stack.pop() != '[') return false;
            }
            else if(ch == '>') {
                if (stack.pop() != '<') return false;
            }
        }

        return stack.empty() ? true : false;
    }
}
