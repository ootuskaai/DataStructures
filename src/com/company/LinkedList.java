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

    public int getKthFromTheEnd(int Kth) {
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

    //better way
    public void printMiddle() {
        Node a = first;
        Node b = first;
        while (b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }

        if (b == last)
            System.out.println(a.value);
        else
            System.out.println(a.value+" "+a.next.value);
    }

    //my first version
    public void printMiddle2() {
        if (isEmpty())
            throw new IllegalStateException();

        Node f = first;
        Node s = last;
        while (true) {
            if(f == s) {
                System.out.println("The middle is: " + f.value);
                break;
            }
            else if(f.next == s) {
                System.out.println("The middle is: " + f.value + " and " + s.value);
                break;
            }
            else {
                f = f.next;
                s = getPrevious(s);
            }
        }
    }

    public int[] getMiddle() {
        ArrayTing arr = new ArrayTing(0);

        if(isEmpty())
            throw new IllegalStateException();

        Node a = first;
        Node b = first;
        while(b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }

        if (b == last)
            arr.insert(a.value);
        else {
            arr.insert(a.value);
            arr.insert(a.next.value);
        }
        int[] newArr = arr.toArray();
        return newArr;
    }

}
