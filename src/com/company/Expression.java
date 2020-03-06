package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List leftBracket = Arrays.asList('(', '{', '[','<');
    private final List rightBracket = Arrays.asList(')', '}', ']', '>');

    public boolean isBalance(String input) {
        if(input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for (char ch: input.toCharArray()) {
            if(isLeftBracket(ch)) stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.empty()) return false;
                if (isBracketMatch(stack.pop(), ch)) return false;
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

    private boolean isBracketMatch(char left, char right) {
        return leftBracket.indexOf(left) == rightBracket.indexOf(right);
    }
}
