package com.bazlur.datastructure;

/**
 * @author Bazlur Rahman Rokon
 * @date 2/4/15.
 */
public class Node {
    private int value;
    private Node next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
