package com.tiy.ssa.weekone.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTest {

	@Test
	public void test() {
		assertEquals("igpay", new PigLatin("pig").translate());
		assertEquals("atinlay", new PigLatin("latin").translate());
		assertEquals("isway", new PigLatin("is").translate());
		assertEquals("ardhay", new PigLatin("hard").translate());
		assertEquals("otay", new PigLatin("to").translate());
		assertEquals("eakspay", new PigLatin("speak").translate());	
		assertEquals("igpay atlinlay isway ardhay otay eakspay", new PigLatin("pig latin is hard to speak").translate());	
	}

}
