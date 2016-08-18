package com.tiy.ssa.weekthree.assignmenttwo;

import com.tiy.ssa.weekone.assignmentfour.Location;

public class Bishop implements Piece {

    Location bishop;

    public Bishop(Location location) {
        this.bishop = location;
    }

    @Override
    public boolean canMove(Location where) {

        if (bishop.x > 7 || bishop.x < 0 || bishop.y > 7 || bishop.y < 0)
            return false;

        if (where.x == this.bishop.x && where.y == this.bishop.y)
            return false;
        
        if (Math.abs(where.x - this.bishop.x) == Math.abs(where.y - this.bishop.y))
            return true;

        return false;
    }

    @Override
    public int intrinsic() {
        return 3;
    }

    @Override
    public Location where() {
        return bishop;
    }

    @Override
    public int compareTo(Piece o) {
        
        if (this.intrinsic() < o.intrinsic())
            return -1;
        if (this.intrinsic() > o.intrinsic())
            return 1;
        
        //if equal, compare to board center
        int p1 = Math.abs(this.bishop.x - 4) + Math.abs(this.bishop.y - 4);
        int p2 = Math.abs(o.where().x - 4) + Math.abs(o.where().y - 4);

        if (p1 < p2)
            return 1;
        else if (p1 > p2)
            return -1;
        
        return 0;
    }

}
