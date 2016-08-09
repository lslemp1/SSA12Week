package com.tiy.ssa.weektwo.assignmenttwo;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FooTest {

    Set <Foo> s = new HashSet<>();
    
    @Test
    public void setTest() {
        
        Foo f = new Foo("foo");
        Foo f2 = new Foo("foo");
        assertFalse(f.equals(f2) && f2.equals(f));

    }

}
