package com.company;

public class ArrayTing {
    private int[] items;
    private int count;

    public ArrayTing(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        resizeIfRequired();
        items[count++] = item;
    }

    public void insertAt(int item, int index) {
        if(index < 0 || index > count)
            throw new IllegalArgumentException();

        resizeIfRequired();

        //fill the last one than and so on until reach at the index
        //items[i + 1] => last one
        for (int i = count - 1; i >= index; i--)
            items[i + 1] = items[i];

        items[index] = item;
        count++;
    }

    public void removeAt(int index) {
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        for(int i = index; i + 1 < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    private void resizeIfRequired() {
        if(items.length == count) {
            int[] newItems = new int[count * 2];
            for(int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
    }

    public void print() {
        for(int i = 0 ; i < count; i++)
            System.out.println(items[i]);
    }

    public int indexOf(int item) {
        for(int i = 0; i < count; i++)
            if(items[i] == item)
                return i;
        return -1;
    }

    public int max() {
        int max = 0;
        for (int item:items)
            if (item > max)
                max = item;

        return max;
    }

    public int min() {
        return 0;
    }

    public int sum() {
        return 0;
    }

    public int countItem(int item) {
        return 0;
    }

    public int firstItem() {
        return 0;
    }

    public int lastItem() {
        return 0;
    }

    public int count() {
        return count;
    }

    public boolean contains(int item) {
        for (int i:items)
            if(i == item)
                return true;
        return false;
    }

    public void reverse() {
        int[] newItems = new int[count];
        for(int i = 0; i < count; i++)
            newItems[i] = items[count - (i + 1)];
        items = newItems;
    }

    public ArrayTing intersect(ArrayTing other) {
        ArrayTing intersect = new ArrayTing(count);
        for(int item:items)
            if(other.contains(item))
                intersect.insert(item);
        return intersect;
    }
}
