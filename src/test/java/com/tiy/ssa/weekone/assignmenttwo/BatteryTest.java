package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BatteryTest {

	@Test
	public void getCapacity(){
		assertEquals(100, new Battery(100,60).getCapacity(),0);
	}
	
	@Test
	public void getRemaining(){
		assertEquals(100, new Battery(200,100).getRemaining(),0);
	}
		
	
	@Test
	public void charge() {
		assertEquals(100, new Battery(100, 60).charge(60),0);
		assertEquals(60, new Battery(100, 40).charge(20),0);
		assertEquals(50.5F, new Battery(100, 25F).charge(25.5F),0);
		assertEquals(27.65F, new Battery(100, 10.35F).charge(17.30F),0);
		//false case
		//assertEquals(120, new Battery(100).charge(40, 80),0);
		Battery b = new Battery(100, 40);
		assertEquals(90, b.charge(50),0);
		
	}

	@Test
	public void discharge(){
		assertEquals(30, new Battery(100,80).discharge(50),0);
		assertEquals(10, new Battery(100,40).discharge(30),0);
		assertEquals(22.8F, new Battery(100,73.5F).discharge(50.7F),0);
		assertEquals(47.3F, new Battery(100,51.2F).discharge(3.9F),0);
		//false case
		//assertEquals(-10, new Battery(100).discharge(90, 80),0);
		Battery b = new Battery(100, 90);
		assertEquals(50, b.discharge(40),0);
	}
	
	@Test
	public void howLong(){
		assertEquals(168.0F, new Battery(100, 42.0F).howLong(15.0F),0);
		assertEquals(324.0F, new Battery(100,54.0F).howLong(10.0F),0);
		assertEquals(726.0F, new Battery(100,24.2F).howLong(2.0F),0);
		assertEquals(480.0F, new Battery(1000,400.0F).howLong(50.0F),0);
		//false case
		//assertEquals(660.0F, new Battery(100).howLong(10.0F, 110.0F),0);
	}
}
