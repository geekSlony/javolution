/*
 * Javolution - Java(TM) Solution for Real-Time and Embedded Systems
 * Copyright (C) 2012 - Javolution (http://javolution.org/)
 * All rights reserved.
 * 
 * Permission to use, copy, modify, and distribute this software is
 * freely granted, provided that this notice is preserved.
 */
package org.javolution.util.internal.map;

import java.util.Iterator;

import org.javolution.util.FastMap;
import org.javolution.util.function.Equality;
import org.javolution.util.function.Order;

/**
 * An reversed view over a map.
 */
public final class ReversedMapImpl<K,V> extends FastMap<K,V> {

    private static final long serialVersionUID = 0x700L; // Version.
    private final FastMap<K,V> inner;

    public ReversedMapImpl(FastMap<K,V> inner) {
        this.inner = inner;
    }

    @Override
    public void clear() {
        inner.clear();
    }

    @Override
    public ReversedMapImpl<K,V> clone() {
        return new ReversedMapImpl<K,V>(inner.clone());
    }

    @Override
    public Entry<K,V> putEntry(K key, V value) {
        return inner.putEntry(key, value);
    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
        return inner.descendingIterator();
    }

    @Override
    public Iterator<Entry<K, V>> descendingIterator() {
        return inner.iterator();
    }

    @Override
    public Iterator<Entry<K, V>> iterator(K fromKey) {
        return inner.descendingIterator(fromKey);
    }

    @Override
    public Iterator<Entry<K, V>> descendingIterator(K fromKey) {
        return inner.iterator(fromKey);
    }

    @Override
    public Entry<K, V> getEntry(K key) {
        return inner.getEntry(key);
    }

    @Override
    public Entry<K, V> removeEntry(K key) {
        return inner.removeEntry(key);
    }

    @Override
    public Equality<? super V> valuesEquality() {
        return inner.valuesEquality();
    }

    @Override
    public Order<? super K> comparator() {
        return inner.comparator();
    }

    @Override
    public int size() {
        return inner.size();
    }

    @Override
    public boolean isEmpty() {
        return inner.isEmpty();
    }

}