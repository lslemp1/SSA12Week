package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BatteryTest {

	@Test
	public void charge() {
		assertEquals(100, new Battery(100).charge(40, 60),0);
		assertEquals(60, new Battery(100).charge(20, 40),0);
		assertEquals(50.5F, new Battery(100).charge(25.5F, 25F),0);
		assertEquals(27.65F, new Battery(100).charge(17.30F, 10.35F),0);
	}

	@Test
	public void discharge(){
		assertEquals(30, new Battery(100).discharge(50, 80),0);
		assertEquals(10, new Battery(100).discharge(30, 40),0);
		assertEquals(22.8F, new Battery(100).discharge(50.7F, 73.5F),0);
		assertEquals(47.3F, new Battery(100).discharge(3.9F, 51.2F),0);
		
	}
}
