package com.tiy.ssa.weekone.assignmentone;

import java.util.Collection;
//import java.util.List;

import static org.junit.Assert.*;

public class TestUtils {
    private TestUtils() {

    }

    public static <T> void membership(Collection<? extends T> expected, Collection<? extends T> actual) 
    {
        assertTrue("", expected.containsAll(actual));
        assertEquals("", expected.size(), actual.size());
        
        //expected.sorted();
        //foo().sorted();
        //assertEquals("", expected, foo());
        
        //List<String> ss;
        //List<Object> os = (List) ss;
    }
}
