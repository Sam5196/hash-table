package com.bridgelabz;

import java.util.ArrayList;

public class HashMap<K, V> {
    private final int sizeOfArray;
    ArrayList<LinkedList<K>> arrayList;

    public HashMap() {
        sizeOfArray = 10;
        arrayList = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++) {
            arrayList.add(null);
        }
    }
    public V get(K key) {

        int indexNumber = this.getIndexNumber(key);
        LinkedList<K> linkedList = arrayList.get(indexNumber);

        if (linkedList == null) {
            return null;
        }
        MyMapNode<K, V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
        return mapNode == null ? null : mapNode.getValue();
    }

    private int getIndexNumber(K key) {

        int hashCode = Math.abs(key.hashCode());
        return hashCode % this.sizeOfArray;
    }

    public void add(K key, V value) {

        int index = this.getIndexNumber(key);
        LinkedList<K> linkedList = this.arrayList.get(index);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.arrayList.set(index, linkedList);
        }

        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            linkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    public String toString() {
        return "HashMap{" + arrayList + '}';
    }
}

