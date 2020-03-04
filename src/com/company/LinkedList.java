package com.company;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item) {
        Node node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLsat(int item) {
        Node node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void removeFirst() {
        if(isEmpty())
            throw new NoSuchElementException();

        if (isSame())
            clear();
        else {
            Node snd = first.next;
            first.next = null;
            first = snd;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (isSame())
            clear();
        else {
            Node prev = getPrevious(last);
            last = prev;
            last.next = null;
            size--;
        }
    }

    private Node getPrevious(Node node) {
        Node cur = first;
        while (cur != null) {
            if (cur.next == node) return cur;
            cur = cur.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private boolean isSame() {
        return first == last;
    }

    private void clear() {
        first = last = null;
        size = 0;
    }

    public int indexOf(int item) {
        Node cur = first;
        int idx = 0;
        while (cur != null) {
            if (cur.value == item) return idx;
            cur = cur.next;
            idx++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public int[] toArray() {
        int[] arr = new int[size];
        Node cur = first;
        int idx = 0;
        while (cur != null) {
            arr[idx++] = cur.value;
            cur = cur.next;
        }
        return arr;
    }
}
