package com.company;

import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries;

    public HashTable(int len) {
        if (len <= 0)
            throw new IllegalArgumentException();

        entries = new LinkedList[len];
    }

    public void put(int key, String value) {
        int index = hash(key);
        if (entries[index] == null)
            entries[index] = new LinkedList<>();

        LinkedList<Entry> bucket = entries[index];
        for (Entry entry: bucket) {
            if(entry.key == key) {
                entry.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key, value));
    }

    private int hash(int key) {
        return Math.abs(key) % entries.length;
    }
}
