package com.tiy.ssa.weekthree.assignmentone;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Test;

public class DecoratorSSAMapTest {

    Map<String, Integer> map = new DecoratorSSAMap<>();
    
    @After
    public void clear(){
        map.clear();
    }
    
    @Test
    public void containsKey() {
        map.put("hello", 5);
        map.put("goodbye", 13);
        assertTrue(map.containsKey("hello"));
        assertFalse(map.containsKey("bye"));               
    }
    
    @Test
    public void containsValue() {
        map.put("hello", 5);
        map.put("goodbye", 13);
        //assertTrue(map.containsValue(13));
        assertFalse(map.containsValue(50));       
    }
    
    @Test
    public void getOrDefault() {
        map.put("hello", 5);
        //assertTrue(map.getOrDefault("hello", 0) == 1);
        assertFalse(map.getOrDefault("bye", 0) == 1);
    }
    
    @Test
    public void isEmptySize() {
        map.put("hello", 5);
        map.put("goodbye", 13);
        assertTrue(map.size() == 2);
        map.clear();
        assertTrue(map.isEmpty());
        assertTrue(map.size() == 0);
    }
    
    @Test
    public void keySet() {
        map.put("hello", 5);
        map.put("goodbye", 13);
        Set<String> test = map.keySet();
        assertTrue(test.contains("hello"));
        assertTrue(test.contains("goodbye"));
        assertFalse(test.contains("adios"));
    }
    
    @Test
    public void putAll() {
        Map<String, Integer> map2 = new DecoratorSSAMap<>();
        map2.put("hello", 5);
        map2.put("goodbye", 13);
        map.putAll(map2);
        assertTrue(map.containsKey("hello"));
        assertTrue(map.get("goodbye")==13);
    }
    
    @Test
    public void replace() {
        map.put("hello", 5);
        map.replace("hello", 7);
        assertTrue(map.get("hello")==7);
    }
    
   

}
