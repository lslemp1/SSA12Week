package com.tiy.ssa.weektwo.assignmentthree;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.tiy.ssa.weektwo.assignmenttwo.User;

public class MapTest {

    
    
    @Test
    public void initial() 
    {
        Map<SocialSecurityNumber, User> map = new HashMap<>();
        
        User user = new User("Aristotle", "Plato", 45);
        User user1 = new User("AC", "Plato", 45);
        User user2 = new User("BC", "Foo", 45);
        User user3 = new User("CD", "Goo", 45);
        
        map.put(new SocialSecurityNumber("123456789"), user);
        map.put(new SocialSecurityNumber("123459874"), user1);
        map.put(new SocialSecurityNumber("123459856"), user2);
        map.put(new SocialSecurityNumber("123452563"), user3);
        assertEquals("", user, map.get(new SocialSecurityNumber("123456789")));
        
        User removed = map.remove(new SocialSecurityNumber("123456789"));
        assertEquals("", user, removed);
        //assertEquals("", user, map.get(new SocialSecurityNumber("123456789")));
        
        
        //treat map as collection - get its entries (keys & values)
        //can also call map.values or map.keySet
        for(Entry entry: map.entrySet())
        {

        }
    }
    
    @Test
    public void stringshash(){
        System.err.println("hoarse".hashCode());
        System.err.print("horse".hashCode());
    }

}
