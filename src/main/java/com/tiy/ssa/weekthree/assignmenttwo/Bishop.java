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
        return 0;
    }

}
