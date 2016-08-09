package com.tiy.ssa.weektwo.assignmenttwo;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GooTest {

    Set <Goo> s = new HashSet<>();
    
    @Test
    public void setTest() {
        
        Goo g = new Goo("goo");
        Goo g2 = new Goo("goo");
        assertTrue(g.equals(g2) && g2.equals(g));

    }
}
