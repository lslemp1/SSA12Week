package com.tiy.ssa.weekthree.assignmentone;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Test;

public class GetDefaultTest {

    @Test
    public void get() {
        GetDefault<String, LocalDate> getDefault = new GetDefault<>();
        getDefault.add("yesterday", LocalDate.MAX);
        assertEquals("", LocalDate.MAX, getDefault.getOrDefault("yesterday", LocalDate.MAX));
    }
    
        @Test
        public void defaultValue(){
            GetDefault<String, LocalDate> getDefault = new GetDefault<>();
            getDefault.add("yesterday", LocalDate.MAX);
            LocalDate today = LocalDate.now();
            assertEquals("", today, getDefault.getOrDefault("today", today));
        }
        
        @Test
        public void test(){
            GetDefault<String, Integer> getDefault = new GetDefault<>();
            getDefault.add("yesterday", 123);
            Integer a = 123;
            assertEquals("", a, getDefault.getOrDefault("yesterday", 123));
        }
    }


