package com.company;

public class LinkedList {
    private class Node  {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        Node node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        Node node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

}
