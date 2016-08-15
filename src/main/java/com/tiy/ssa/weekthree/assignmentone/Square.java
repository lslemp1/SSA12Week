package com.tiy.ssa.weekthree.assignmentone;


//subclassA(Rectangle) is-a superclassB(Square)
//expanding API to superClassB
//extends gives you the code of Rectangle - DRY

public class Square extends Rectangle 
{
    
    public Square(int size) 
    {
        super(size,size);
    }
    
    @Override
    public float area() 
    {        
        return super.area();
    }

    @Override
    public void setWidth(int size) {
        
        super.setWidth(size);
        super.setHeight(size);
    }
    
    @Override
    public void setHeight(int size) {
        
//        super.setHeight(size);
//        super.setWidth(size);
        setHeight(size);
   
    }
}
