package com.tiy.ssa.weekthree.assignmentone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class SSAMap<K, V> implements Map<K, V> {

    @Override
    public abstract V get(Object key);

    @Override
    public abstract V put(K key, V value);

    @Override
    public abstract V remove(Object key);

    @Override
    public abstract Set<Entry<K, V>> entrySet();

    @Override
    public boolean containsKey(Object key) {
        return null != get(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return null != get(value);
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        V returnValue = this.get(key);
        if (returnValue != null)
            return returnValue;

        return defaultValue;
    }

    @Override
    public boolean isEmpty() {
        return 0 == entrySet().size();
    }

    @Override
    public Set<K> keySet() {

        Set<K> key = new HashSet<>();
        for (Entry<K, V> e : entrySet()) {
            key.add(e.getKey());
        }

        if (key.size() == 0)
            return null;
        else
            return key;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (Entry<? extends K, ? extends V> e : m.entrySet())
            put(e.getKey(), e.getValue());
    }

    @Override
    public V replace(K key, V value) {
        V val = get(key);
        if (val != null)
            put(key, value);

        return val;
    }

    @Override
    public int size() {
        return entrySet().size();
    }

    @Override
    public Collection<V> values() {

        List<V> value = new ArrayList<>();

        for (Entry<K, V> e : entrySet()) {
            value.add(e.getValue());
        }

        if (value.size() == 0)
            return null;
        else
            return value;
    }

}
