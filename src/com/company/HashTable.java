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

    public HashTable(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("capacity need to more than 0");
        entries = new LinkedList[capacity];
    }

    public void put(int key, String value) {
        int idx = hash(key);
        if(entries[idx] == null)
            entries[idx] = new LinkedList<>();

        LinkedList<Entry> bucket = entries[idx];
        for (Entry entry: bucket) {
            if(entry.key == key) {
                entry.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key, value));
    }

    public String get(int key) {
        int idx = hash(key);
        LinkedList<Entry> bucket = entries[idx];
        if (bucket != null) {
            for (Entry entry: bucket) {
                if(entry.key == key)
                    return  entry.value;
            }
        }
        return null;
    }

    private int hash(int key) {
        return Math.abs(key) % entries.length;
    }
}
