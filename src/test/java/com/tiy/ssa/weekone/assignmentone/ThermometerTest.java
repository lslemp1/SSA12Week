package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermometerTest {
                           
	@Test
	public void testDisplay() {
		assertEquals("", 78, new Thermometer(78).display(true));
		assertEquals("", 78, new Thermometer(78, false).display(false));
	}

	@Test
	public void FtoC(){
		assertEquals("212F -> 100C", 100, new Thermometer(212).display(false));
		assertEquals("", 0, new Thermometer(32).display(false));
	}
	
	@Test
	public void CtoF(){
		assertEquals("100C -> 212F", 212, new Thermometer(100, false).display(true));
		assertEquals("", 32, new Thermometer(0, false).display(true));
	}
}
