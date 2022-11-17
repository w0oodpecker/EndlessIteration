package org.example;

import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {

    protected Random random; //Встроенный класс
    int min, max;


    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator(this);
    }
}