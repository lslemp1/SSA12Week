package com.tiy.ssa.weekthree.assignmentone;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.tiy.ssa.weekthree.assignmentone.FixFor;

public class FixForTest {

    Iterator<String> theIterator;
    
    @Before
    public void setup(){
        this.theIterator = Arrays.asList("it's", "the", "end").iterator();
    }
    @Test
    public void fix() {
        for(String s: new FixFor<>(theIterator)){
            System.out.println(s);
        }
    }

}
