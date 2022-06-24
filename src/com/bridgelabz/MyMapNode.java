package com.bridgelabz;

public class MyMapNode<K, V> implements Node<K> {
    K key;
    V value;
    Node<K> next;
    public MyMapNode(K key, V value) {
        super();
        this.key = key;
        this.value = value;
        this.next = null;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    public Node<K> getNext() {
        return next;
    }


    public void setNext(Node<K> next) {

        this.next = next;

    }

    public String toString() {
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{" + "K=").append(key).append(" V=").append(value).append('}');
        if (next != null)
            myMapNodeString.append("->").append(next);
        return myMapNodeString.toString();
    }

}
