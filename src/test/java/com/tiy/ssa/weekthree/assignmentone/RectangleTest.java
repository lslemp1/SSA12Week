package com.tiy.ssa.weekthree.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

    @Test
    public void isA() 
    {
        area(new Square(2));        
    }
    
    @Test
    public void test() 
    {
        recalculate(new Rectangle(2, 5));        
    }
    
    private void recalculate(Rectangle rect)
    {
        int height = rect.getHeight();
        rect.setWidth(rect.getWidth() + 10);
        assertEquals("", height*rect.getWidth(), rect.area(), .01);
    }

    
    private void area(Square sq)
    {
        int height = sq.getHeight();
        sq.setWidth(sq.getWidth());
        assertEquals("", height*sq.getWidth(), sq.area(), .01);
    }
    
    @Test
    public void square(){

        Square s = new Square(2);
        assertEquals("", 2, s.getWidth());
        assertEquals("", 2, s.getHeight());
        assertEquals("", 4, s.area(), .01);
    }
    
    @Test
    public void rectangle(){
        Rectangle r = new Rectangle(10,4);
    }

}
