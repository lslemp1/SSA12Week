package com.tiy.weekthree.assignmentfour;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiamondInheritanceTest {

    @Test
    public void happyOrNot() {
        assertFalse("", new DiamondInheritance().isHappy());
    }
    
    @Test
    public void dispatch()
    {
        Goo g = new DiamondInheritance();
        assertFalse("", g.isHappy());
    }

}
