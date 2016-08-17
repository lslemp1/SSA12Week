package com.tiy.ssa.weekthree.assignmentone;

public class Square2 implements Shape{

    //int dimension;
    final Rectangle rectangle;
    
    public Square2(int dimension)
    {
        this.rectangle = new Rectangle(dimension, dimension);
    }
    
    @Override
    public void draw() 
    {
        this.rectangle.draw();       
    }

    @Override
    public float area() 
    {
        return this.rectangle.area();
    }
    
    
    public int getDimension()
    {
        return this.rectangle.getHeight();
    }
    
    
    public void setDimension(int dimension)
    {
        //this.dimension = dimension;
        this.rectangle.setHeight(dimension);
        this.rectangle.setWidth(dimension);
    }

}
