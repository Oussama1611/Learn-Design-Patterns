package com.behavioral.Iterator;

public class IteratorApp {

    public static void main(String[] args) throws InterruptedException {
        ConcreteAggregate agg = new ConcreteAggregate();
        ConcreteIterator iterator = (ConcreteIterator) agg.createIterator(0,20);
        while(!iterator.isDone()){
            Thread.sleep(2000);
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
