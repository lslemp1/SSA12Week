package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;
import java.time.LocalDate;

import org.junit.Test;

public class Foo {

	public void foo(LocalDate date)
	{
	    System.err.println("foo LD");
	}
	
	public void foo(LocalDate date, int offset)
	{
	    
	}
	
	public void foo(Object obj)
	{
	    System.err.println("foo obj");
	}
	
	@Test
	public void test(){
	    Foo f = new Foo();
	    LocalDate now = LocalDate.now();
	    f.foo(now);
	    
	    Object o = now;
	    f.foo(o);
	    
	}
	
}
