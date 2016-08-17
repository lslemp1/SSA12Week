package com.tiy.ssa.weekthree.assignmenttwo;

import com.tiy.ssa.weekone.assignmentfour.Location;

public class Pawn implements Piece {

    Location pawn;

    public Pawn(Location location) {
        this.pawn = location;
    }

    @Override
    public boolean canMove(Location where) {

        if (pawn.x > 7 || pawn.x < 0 || pawn.y > 7 || pawn.y < 0)
            return false;
        if (where.x - this.pawn.x != 0)
            return false;
        if (where.y - this.pawn.y == 1)
            return true;
        if (where.y - this.pawn.y == 2 && this.pawn.y == 1)
            return true;

        return false;
    }

    @Override
    public int intrinsic() {
        return 1;
    }

    @Override
    public Location where() {
        return pawn;
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
