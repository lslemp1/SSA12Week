package com.tiy.ssa.weekthree.assignmentthree;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class SHA1FileVerifierTest {

    @Test
    public void test() throws IOException {
        
        File file = new File("C:/Users/admin/workspace/SSA12Week/resources/eclipse-inst-win64.exe");
        SHA1FileVerifier algorithm1 = new SHA1FileVerifier(file, "SHA-1");
        SHA1FileVerifier algorithm2 = new SHA1FileVerifier(file, "MD5");
        SHA1FileVerifier algorithm3 = new SHA1FileVerifier(file, "SHA-256");
        SHA1FileVerifier algorithm4 = new SHA1FileVerifier(file, "SHA-512");
        
        assertTrue(algorithm1.hash(file)!=null);        
        assertTrue(algorithm2.hash(file)!=null);        
        assertTrue(algorithm3.hash(file)!=null);       
        assertTrue(algorithm4.hash(file).equals("21302bcf1d6d22ce3022af54f958649695afb84e38c8e640eafd7e64ba852ff3c13eae33db9e19affbc4e861341391143a40669da839c1bddcc8dea7240218e9"));
    }

}
