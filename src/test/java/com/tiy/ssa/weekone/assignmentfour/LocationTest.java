package com.tiy.ssa.weekone.assignmentfour;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

	@Test
	public void test() {
		Location a = new Location(0,0);
		equals(a.move());
		assertTrue(a.isHome());
		
		Location b = new Location(5,25);
        equals(b.move());
        assertTrue(b.isHome());
        
        Location c = new Location(-15,10);
        equals(c.move());
        assertTrue(c.isHome());
        
        Location d = new Location(-60,-74);
        equals(d.move());
        assertTrue(d.isHome());
	}

}
