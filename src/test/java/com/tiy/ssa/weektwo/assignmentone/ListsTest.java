package com.tiy.ssa.weektwo.assignmentone;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ListsTest {

    List<String> one = new ArrayList<>();
    List<String> other = new ArrayList<>();
    List<String> input = new ArrayList<>();
    
    @Before
    public void setup() {
        this.one.add("Apple");
        this.one.add("Orange");
        this.one.add("Banana");
        
        this.other.add("Blue");
        this.other.add("Green");
        this.other.add("Orange");
        
        this.input.add("a");
        this.input.add("cat");
        this.input.add("to");
        this.input.add("relax");
        this.input.add("jump");
    }
    
    @Test
    public void match(){
        assertEquals("", "[Orange]", Lists.match(one, other).toString());
        assertFalse(Lists.match(one, other).toString().contains("[Apple]"));
        assertFalse(Lists.match(one, other).toString().contains("[Banana]"));
        assertFalse(Lists.match(one, other).toString().contains("[Blue]"));
        assertFalse(Lists.match(one, other).toString().contains("[Green]"));
    }
    
    @Test
    public void descending(){
        assertTrue("relax".equals(Lists.descendingBySize(input).get(0)));
        assertTrue("jump".equals(Lists.descendingBySize(input).get(1)));
        assertTrue("cat".equals(Lists.descendingBySize(input).get(2)));
        assertTrue("to".equals(Lists.descendingBySize(input).get(3)));
        assertTrue("a".equals(Lists.descendingBySize(input).get(4)));
    }

}
