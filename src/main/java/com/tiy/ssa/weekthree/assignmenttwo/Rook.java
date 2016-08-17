package com.tiy.ssa.weekthree.assignmenttwo;

import com.tiy.ssa.weekone.assignmentfour.Location;

public class Rook implements Piece {

    Location rook;

    public Rook(Location location) {
        this.rook = location;
    }

    @Override
    public boolean canMove(Location where) {
        
        if(rook.x > 7 || rook.x < 0 || rook.y > 7 || rook.y < 0)
            return false;
        
        if (where.x == this.rook.x || where.y == this.rook.y)
            return true;
        return false;
    }

    @Override
    public int intrinsic() {
        return 5;
    }

    @Override
    public Location where() {
        return rook;
    }

    @Override
    public int compareTo(Piece o) 
    {
        if (this.intrinsic() < o.intrinsic())
            return -1;
        if (this.intrinsic() > o.intrinsic())
            return 1;
        return 0;
    }

}
