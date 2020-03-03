package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayTing numbers = new ArrayTing(3);
        numbers.insert(100);
        numbers.insert(200);
        numbers.insert(300);
        numbers.reverse();
        numbers.print();

    }
}
