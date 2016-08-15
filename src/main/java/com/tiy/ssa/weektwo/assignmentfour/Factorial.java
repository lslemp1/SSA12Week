package com.tiy.ssa.weektwo.assignmentfour;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Factorial {

    static final Map<Integer, BigInteger> CACHE = new HashMap<>();
    
    private Factorial(){
        
    }
    
    public static BigInteger factorial(int input)
    {
        if(input < 0)
            throw new IllegalArgumentException("factorial only works on nuumbers >= 0");
    
        BigInteger result;
        
        if (input == 0) 
            return BigInteger.ONE;
        if (null != (result = CACHE.get(input))) 
            return result;
        
        result = BigInteger.valueOf(input).multiply(factorial(input-1));
        CACHE.put(input, result);
        return result;
    }
}
