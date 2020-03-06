package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List leftBracket = Arrays.asList('(', '{', '[','<');
    private final List rightBracket = Arrays.asList(')', '}', ']', '>');

    public boolean isBalance(String input){
        if(input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for (char ch: input.toCharArray()) {
            if(isLeftBracket(ch)) stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                char top = stack.pop();
                if (bracketMatch(top,ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBracket.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBracket.contains(ch);
    }

    private boolean bracketMatch(char left, char right) {
        return leftBracket.indexOf(left) == rightBracket.indexOf(right);
    }

    //version 2 ting
    public boolean isBalanced2(String input) {
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
