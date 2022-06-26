package com.bridgelabz;


public class LinkedList<K> {
    private Node<K> head;
    private Node<K> tail;
    public Node<K> search(K key) {

        Node<K> temp = head;
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                return temp;
            }

            temp = temp.getNext();
        }
        return null;
    }
    public void append(Node<K> myNode) {

        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }
    public boolean remove(K key) {

        Node<K> temp = head;
        Node<K> prev = null;
        while (temp != null) {
            if (temp.getKey() == key) {
                prev.setNext(temp.getNext());
                return true;
            }
            prev = temp;
            temp = temp.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n MyLinkedListNodes{" + head + "}";
    }

    public void printMyNodes() {
        System.out.println(" My Nodes :" + head);
    }

}
