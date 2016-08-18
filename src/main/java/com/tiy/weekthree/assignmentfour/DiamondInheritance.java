package com.tiy.weekthree.assignmentfour;

public class DiamondInheritance implements Goo, Hoo 
{
    @Override
    public boolean isHappy()
    {
        return Goo.super.isHappy();
    }

}
