package com.company;

import java.util.Arrays;

public class ArrayTing {
    private int[] items;
    private int count;

    public ArrayTing(int len) {
        if (len <= 0) len = 1;
        items = new int[len];
    }

    public void insert(int item) {
        resizeIfRequired();
        items[count++] = item;
    }

    public void insertAt(int item, int index) {
        if(index < 0 || index > count)
            throw new IllegalArgumentException();

        resizeIfRequired();

        for (int i = count - 1; i >= index; i--)
            items[i + 1] = items[i];

        items[index] = item;
        count++;
    }

    public void removeAt(int index) {
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        for(int i = index; i < count - 1; i++) {
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

    public int indexOf(int item) {
        for(int i = 0; i < count; i++)
            if(items[i] == item)
                return i;
        return -1;
    }

    public int max() {
        if (isEmpty())
            throw new IllegalStateException("array is empty");
        int max = items[0];
        for (int item:items)
            if (item > max)
                max = item;
        return max;
    }

    public int min() {
        if (isEmpty())
            throw new IllegalStateException("array is empty");

        int min = items[0];
        for(int item:items)
            if(item < min)
                min = item;
        return min;
    }

    public int sum() {
        if (isEmpty())
            throw new IllegalStateException("array is empty");

        int sum = items[0];
        for (int item:items)
            sum += item;
        return sum;
    }

    public int countByItem(int item) {
        int acc = 0;
        for (int i:items)
            if(i == item)
                acc++;
        return acc;
    }

    public int firstItem() {
        if (isEmpty())
            throw new IllegalStateException("array is empty");
        return items[0];
    }

    public int lastItem() {
        if (isEmpty())
            throw new IllegalStateException("array is empty");
        return items[count - 1];
    }

    public int currCount() {
        return count;
    }

    public boolean contains(int item) {
        for (int i:items)
            if(i == item)
                return true;
        return false;
    }

    public void reverse() {
        if (isEmpty())
            throw new IllegalStateException("array is empty");

        int[] newItems = new int[count];
        for(int i = 0; i < count; i++)
            newItems[i] = items[count - (i + 1)];
        items = newItems;
    }

    public ArrayTing intersect(ArrayTing other) {
        if (count == 0 || other.currCount() == 0)
            throw new IllegalStateException("array is empty");
        else if (other == null)
            throw new IllegalArgumentException("other is null");

        ArrayTing intersect = new ArrayTing(count);
        for(int item:items)
            if(other.contains(item))
                intersect.insert(item);
        return intersect;
    }

    public ArrayTing notIntersect(ArrayTing other) {
        if (count == 0 || other.currCount() == 0)
            throw new IllegalStateException("array is empty");
        else if (other == null)
            throw new IllegalArgumentException("other is null");

        ArrayTing notIntersect = new ArrayTing(count);
        for (int item: items)
            if(!other.contains(item))
                notIntersect.insert(item);
        return notIntersect;
    }

    public int[] toArray() {
        if (isEmpty())
            throw new IllegalStateException("array is empty");

        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = items[i];
        }
        return arr;
    }

    private boolean isEmpty() {
        return count == 0;
    }

    private void isEmptyError() {
        if (isEmpty())
            throw new IllegalStateException("array is empty");
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }

    public void printEach() {
        for(int item:items)
            System.out.println(item);
    }
}
