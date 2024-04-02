package com.behavioral.Iterator;

public class ConcreteAggregate implements Aggregate{
    @Override
    public Iterator createIterator(Object obj, Object size) {
        return new ConcreteIterator((Integer) obj, (Integer) size);
    }
}
