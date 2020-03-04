package com.company;

public class LinkedList {
    private class Node  {
        private int value;
        private Node next;
    }

    private Node first;
    private Node last;
    private int size;

    public void addList(int item) {
        Node node = new Node();
        node.value = item;
    }

}
