package com.tiy.ssa.weekone.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaybePalindromeTest {

	@Test
	public void isPalindrome(){
		
		MaybePalindrome a = new MaybePalindrome("racecar");
		assertTrue(a.isPalindrome());
		assertTrue(a.toString().compareTo("racecar")==0);
		
		MaybePalindrome b = new MaybePalindrome("anna");
		assertTrue(b.isPalindrome());
		assertTrue(b.toString().compareTo("anna")==0);
		
		MaybePalindrome c = new MaybePalindrome("hello");
		assertFalse(c.isPalindrome());
		assertFalse(c.toString().compareTo("hello")==0);
		 
		MaybePalindrome d = new MaybePalindrome("goodbye");
		assertFalse(d.isPalindrome());
		assertFalse(d.toString().compareTo("goodbye")==0);
	
	}

}
