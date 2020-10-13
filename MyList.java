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

    @Override
    public <T1> T1[] toArray(IntFunction<T1[]> generator) {
        return null;
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter) {
        return false;
    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public Stream<T> stream() {
        return null;
    }

    @Override
    public Stream<T> parallelStream() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return (this.begin == null ? true : false);
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        Node<T> node = new Node<>(t);
        if (this.begin == null) {
            this.begin = node;
        }
        else {
            end().setNext(node);
        }
        this.counter++;
        return true;
    }

    public Node<T> end() {
        if (this.begin == null) {
            return null;
        }
        Node<T> iter = this.begin;
        while (iter.hasNext()) {
            iter = iter.getNext();
        }
        return iter;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }
}