package com.tiy.ssa.weekthree.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tiy.ssa.weekone.assignmentfour.Location;

public class PieceTest {
    
    
    @Test
    public void king(){
        Piece king = new King(new Location(0,4));
        assertTrue(king.canMove(new Location(1,4)));
        assertTrue(king.canMove(new Location(0,5)));
        assertFalse(king.canMove(new Location(2,2)));
    }
    
    @Test
    public void queen(){
        Piece queen = new Queen(new Location(0,3));
        assertTrue(queen.canMove(new Location(6,3)));
        assertTrue(queen.canMove(new Location(3,0)));
        assertTrue(queen.canMove(new Location(4,7)));
        assertFalse(queen.canMove(new Location(2,2)));
    }
    
    @Test
    public void rook() {
        Piece rook = new Rook(new Location(7,0));
        assertTrue(rook.canMove(new Location(3,0)));
        assertTrue(rook.canMove(new Location(7,6)));
    }
    
    @Test
    public void bishop(){
        Piece bishop = new Bishop(new Location(0,5));
        assertTrue(bishop.canMove(new Location(3,2)));
        assertTrue(bishop.canMove(new Location(2,7)));
        assertFalse(bishop.canMove(new Location(1,5)));
    }
    
    @Test
    public void knight(){
        Piece knight = new Knight(new Location(0,6));
        assertTrue(knight.canMove(new Location(2,7)));
        assertTrue(knight.canMove(new Location(1,4)));
        assertFalse(knight.canMove(new Location(3,3)));
    }
    
    @Test
    public void pawn(){
        Piece pawn = new Pawn(new Location(7,1));
        assertTrue(pawn.canMove(new Location(7,2)));
        assertTrue(pawn.canMove(new Location(7,3)));
        assertFalse(pawn.canMove(new Location(6,1)));
    }
    
    @Test
    public void compare(){
       Piece king = new King(new Location(0,4));
       Piece king2 = new King(new Location(3,4));
       Piece queen = new Queen(new Location(0,3));
       Piece rook = new Rook(new Location(7,0));
       Piece bishop = new Bishop(new Location(3,3));
       Piece knight = new Knight(new Location(0,6));
       Piece pawn = new Pawn(new Location(1,5));
       
       assertEquals("", 1, queen.compareTo(pawn));
       assertEquals("", -1, pawn.compareTo(knight));
       assertEquals("", -1, knight.compareTo(bishop));
       assertEquals("", 1, king.compareTo(rook));
       assertEquals("", 1, king2.compareTo(king));  
       
       
       assertFalse(king.canMove(new Location(0,4)));
       assertFalse(queen.canMove(new Location(0,3)));
       assertFalse(rook.canMove(new Location(7,0)));
       assertFalse(bishop.canMove(new Location(3,3)));
       assertFalse(knight.canMove(new Location(0,6)));
       assertFalse(pawn.canMove(new Location(1,5)));
       
    }
    

    
}
