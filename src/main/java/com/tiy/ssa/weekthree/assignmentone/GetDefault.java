package com.tiy.ssa.weekthree.assignmentone;

import java.util.HashMap;
import java.util.Map;

public class GetDefault<K, V> {

    final Map<K, V> map = new HashMap<>();
    
    
    void add(K key, V Value)
    {
       this.map.put(key, Value);
    }
    
    public V getOrDefault(K key, V def)
    {
        V returnValue = this.map.get(key);
        if(returnValue != null)
            return returnValue;
       
        return def;
    }
    
}
