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

    public void addLast(int item) {
        Node node = new Node(item);
        if(isEmpty())
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
        if(isEmpty())
            throw new NoSuchElementException();

        if(isSame())
            clear();
        else {
            Node prev = getPrevious(last);
            last = prev;
            last.next = null;
            size--;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public boolean isSame() {
        return first == last;
    }

    private Node getPrevious(Node node) {
        Node curr = first;
        while (curr != null) {
            if(curr.next == node) return curr;
            curr = curr.next;
        }
        return null;
    }

    private void clear() {
        first = last = null;
        size = 0;
    }

    public int indexOf(int item) {
        Node curr = first;
        int idx = 0;
        while (curr != null) {
            if(curr.value == item) return idx;
            curr = curr.next;
            idx++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public int[] toArray() {
        int[] arr = new int[size];
        Node curr = first;
        int idx = 0;
        while (curr != null) {
            arr[idx++] = curr.value;
            curr = curr.next;
        }
        return arr;
    }

    public void reverse() {
        if (isEmpty()) return;

        Node prev = first;
        Node curr = first.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        last = first;
        last.next = null;
        first = prev;
    }

    //will dont know size
    //and we cant get size
    public int getKthFromTheEnd(int Kth) {
        //first 10 last 50
        //[10 -> 20 -> 30 -> 40 -> 50]
        //fp/sp
        //k=3 d=2
        //fp           sp
        //      fp           sp
        //              fp          sp
        // return fp


        if (isEmpty())
            throw new IllegalStateException();

        Node fp = first;
        Node sp = first;
        int dst = Kth - 1;
        for (int i = 0; i < dst; i++) {
            sp = sp.next;
            if(sp == null)
                throw new IllegalArgumentException();
        }
        while (sp != last) {
            fp = fp.next;
            sp = sp.next;
        }

        return fp.value;
    }
}
