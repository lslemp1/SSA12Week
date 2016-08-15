package com.tiy.ssa.weekthree.assignmentone;

public class Rectangle implements Shape{

    //protected = package private + subclasses    
    protected int height, width;
    
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    
    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet.");        
    }

    @Override
    public float area() 
    {        
        return getHeight() * getWidth();
    }
    
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }

}
