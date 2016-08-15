package com.tiy.ssa.weektwo.assignmentfour;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class FactorialTest {

    @Test
    public void test() {
        BigInteger b = new BigInteger("6");
        BigInteger c = new BigInteger("120");
        BigInteger d = new BigInteger("5040");
        BigInteger e = new BigInteger("1307674368000");
        BigInteger f = new BigInteger("1");
        assertEquals("", b, Factorial.factorial(3));
        assertEquals("", c, Factorial.factorial(5));
        assertEquals("", d, Factorial.factorial(7));
        assertEquals("", e, Factorial.factorial(15));
        assertEquals("", f, Factorial.factorial(0));
        //assertEquals("", 1, Factorial.factorial(-1));
    }

}
