package com.company;

public class LinkedListQueue {

    private class Node {
        private int value;
        private Node next;
        public Node(int len) {
            this.value = len;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    //O(1)
    public void enqueue(int item) {
        Node node = new Node(item);
        if (isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        count++;
    }

    //O(1)
    public int dequeue() {
        if(isEmpty())
            throw new IllegalStateException();

        int value;
        if (isOnlyOne()) {
            value = head.value;
            head = tail = null;
        }
        else {
            value = head.value;
            Node second = head.next;
            head.next = null;
            head = second;
        }
        count--;
        return value;
    }

    //O(1)
    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();
        return head.value;
    }

    //O(1)
    public int size() {
        return count;
    }

    //O(1)
    public boolean isEmpty() {
        return count == 0;
    }

    //O(1)
    public boolean isOnlyOne() {
        return head == tail;
    }
}
