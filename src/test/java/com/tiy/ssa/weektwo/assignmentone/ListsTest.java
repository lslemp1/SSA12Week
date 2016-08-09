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
        
        this.one.add("hi");
        this.one.add("bye");
        
        this.other.add("hi");
        this.other.add("hello");
        this.other.add("hi");
        
        this.input.add("a");
        this.input.add("cat");
        this.input.add("to");
        this.input.add("relax");
        this.input.add("jump");
    }
    
    @Test
    public void match(){
        List<String> match = Lists.match(one, other);
        assertEquals("[hi]", 1, match.size());
        assertEquals("", "[hi]", Lists.match(one, other).toString());
        assertFalse(Lists.match(one, other).toString().contains("[bye]"));
        assertFalse(Lists.match(one, other).toString().contains("[hello]"));
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
