package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;
import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Foo {

    static final Logger LOGGER = LogManager.getLogger(Foo.class);
   
    
	public void foo(LocalDate date)
	{
	    LOGGER.debug("foo LD");
	    
	}
	
	public void foo(LocalDate date, int offset)
	{
	    
	}
	
	public void foo(Object obj)
	{
	    LOGGER.debug("foo obj");
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
