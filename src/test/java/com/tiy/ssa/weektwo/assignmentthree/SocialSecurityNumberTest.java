package com.tiy.ssa.weektwo.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class SocialSecurityNumberTest {

    @Test
    public void SSTest() 
    {
        assertEquals("", "1234", new SocialSecurityNumber("999451234").last4Digits());
    }

}
