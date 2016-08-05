package com.tiy.ssa.weekone.assignmentfour;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathsTest {


	@Test
	public void logTwo() {
		assertEquals(3, Maths.logTwo(11),0);
		assertEquals(5, Maths.logTwo(32),0);
		assertEquals(6, Maths.logTwo(87),0);
		assertEquals(9, Maths.logTwo(568),0);
		
	}

	public void logThree(){
		assertEquals(0, Maths.logThree(0),0);
		assertEquals(0, Maths.logThree(1),0);
		assertEquals(1, Maths.logThree(3),0);
		
	}
	
}
