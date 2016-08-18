package com.tiy.ssa.weekthree.assignmenttwo;

import com.tiy.ssa.weekone.assignmentfour.Location;

public class Queen implements Piece  {
    
    Location queen;

    public Queen(Location location) {
        this.queen = location;
    }

    @Override
    public boolean canMove(Location where) {
        
        if(queen.x > 7 || queen.x < 0 || queen.y > 7 || queen.y < 0)
            return false;
        
        if(where.x == this.queen.x && where.y == this.queen.y)
            return false;
        
        if(where.x == this.queen.x || where.y == this.queen.y)
            return true;
        if(Math.abs(where.x - this.queen.x) == Math.abs(where.y - this.queen.y))
            return true;
        
        return false;        
    }

    @Override
    public int intrinsic() {
        return 9;
    }

    @Override
    public Location where() {
        return queen;
    }

    @Override
    public int compareTo(Piece o) {
        if (this.intrinsic() < o.intrinsic())
            return -1;
        if (this.intrinsic() > o.intrinsic())
            return 1;
        
      //if equal, compare to board center
        int p1 = Math.abs(this.queen.x - 4) + Math.abs(this.queen.y - 4);
        int p2 = Math.abs(o.where().x - 4) + Math.abs(o.where().y - 4);

        if (p1 < p2)
            return 1;
        else if (p1 > p2)
            return -1;
        
        return 0;
    }

    
}
