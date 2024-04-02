package com.behavioral.Iterator;

public class ConcreteIterator implements Iterator{
    public Integer a;
    public final Integer size;

    public ConcreteIterator(Integer a, Integer size) {
        this.a = a;
        this.size = size;
    }

    @Override
    public Integer current() {
        return a;
    }

    @Override
    public Integer next() {
        if ( a < size )
            a++;
        return a;
    }

    @Override
    public boolean isDone() {
        return a.equals(size);
    }
}
