package com.max.idea;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyList<T> implements Collection<T> {
    class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public boolean hasNext() {
            if (this.next != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    private Node<T> begin;
    private long counter;
    private Comparable comp;

    public MyList(Comparable comp) {
        this.begin = null;
        this.counter = 0;
        this.comp = comp;
    }

    public MyList() {
        this.begin = null;
        this.counter = 0;
    }

    public String toString() {
        String result = "[ ";
        if (this.begin == null) {
            return null;
        }
        else {
            Node<T> iter = this.begin;
            while (iter.hasNext()) {
                result += iter.toString() + ", ";
                iter = iter.getNext();
            }
            result += iter.toString();
        }
        result += " ]";
        return result;
    }

    public long getCounter() {
        return counter;
    }
}