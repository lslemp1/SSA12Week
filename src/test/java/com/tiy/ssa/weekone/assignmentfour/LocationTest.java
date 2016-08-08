package com.tiy.ssa.weekone.assignmentfour;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

	@Test
	public void test() {
		Location a = new Location(0,0);
		equals(a.move());
		assertTrue(a.isHome());
		assertEquals("check 4 moves", 4, a.moveNum());
		
		Location b = new Location(5,25);
		equals(b.move());
		assertTrue(b.isHome());
		assertEquals("check 4 moves", 4, b.move());
        
        Location c = new Location(-15,10);
        equals(c.move());
        assertTrue(c.isHome());
        assertEquals("check 4 moves", 4, c.move());
        
        Location d = new Location(-60,-74);
        equals(d.move());
        assertTrue(d.isHome());
        assertEquals("check 4 moves", 4, d.move());
	}

}
