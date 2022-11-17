package org.example;

import java.util.Iterator;

public class RandomsIterator implements Iterator {

    Randoms random;

    RandomsIterator(Randoms random) {
        this.random = random;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object next() {
        return random.random.ints(random.min, random.max + 1).iterator().nextInt();
    }
}
