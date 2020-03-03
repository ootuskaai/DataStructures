package com.company;

public class ArrayTing {
    private int[] items;
    private int count;

    public ArrayTing(int length) {
        items = new int[length];
    }

    //insert
    public void insert(int item) {
        resizeIfRequired();
        items[count++] = item;
    }

    public void insertAt(int item, int index) {}

    public void removeAt(int index) {
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        //[10,20,30] => remove index 1 => [10,30]
        for(int i = index; i < count; i++) {
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
        return 0;
    }

    public int max() {
        return 0;
    }

    public boolean contains() {
        return true;
    }
}
