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
        
      //if equal, compare to board center
        int p1 = Math.abs(this.pawn.x - 4) + Math.abs(this.pawn.y - 4);
        int p2 = Math.abs(o.where().x - 4) + Math.abs(o.where().y - 4);

        if (p1 < p2)
            return 1;
        else if (p1 > p2)
            return -1;
        
        return 0;
    }

}
