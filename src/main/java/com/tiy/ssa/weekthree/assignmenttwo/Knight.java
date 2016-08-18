package com.tiy.ssa.weekthree.assignmenttwo;

import com.tiy.ssa.weekone.assignmentfour.Location;

public class Knight implements Piece {

    Location knight;

    public Knight(Location location) {
        this.knight = location;
    }

    @Override
    public boolean canMove(Location where) {

        if (knight.x > 7 || knight.x < 0 || knight.y > 7 || knight.y < 0)
            return false;
        
        if (where.x == this.knight.x || where.y == this.knight.y)
            return false;

        if (Math.abs(where.x - this.knight.x) == 1 && Math.abs(where.y - this.knight.y) == 2)
            return true;
        if (Math.abs(where.x - this.knight.x) == 2 && Math.abs(where.y - this.knight.y) == 1)
            return true;

        return false;
    }

    @Override
    public int intrinsic() {
        return 3;
    }

    @Override
    public Location where() {
        return knight;
    }

    @Override
    public int compareTo(Piece o) {
        if (this.intrinsic() < o.intrinsic())
            return -1;
        if (this.intrinsic() > o.intrinsic())
            return 1;
        
        //if equal, compare to board center
        int p1 = Math.abs(this.knight.x - 4) + Math.abs(this.knight.y - 4);
        int p2 = Math.abs(o.where().x - 4) + Math.abs(o.where().y - 4);

        if (p1 < p2)
            return 1;
        else if (p1 > p2)
            return -1;
        
        return 0;
    }

}
