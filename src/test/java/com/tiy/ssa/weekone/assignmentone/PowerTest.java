package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerTest {

	@Test
	public void testSquare() {
		assertEquals("", 1, new Power(1).squared());
		assertEquals("", 4, new Power(2).squared());
		assertEquals("", 9, new Power(3).squared());
		assertEquals("", 16, new Power(4).squared());
		assertEquals("", 25, new Power(5).squared());
	}

	@Test
	public void testCubed(){
		assertEquals("", 1, new Power(1).cubed());
		assertEquals("", 8, new Power(2).cubed());
		assertEquals("", 27, new Power(3).cubed());
		assertEquals("", 64, new Power(4).cubed());
		assertEquals("", 125, new Power(5).cubed());
	}
}
