package com.tiy.ssa.weekthree.assignmenttwo;

import com.tiy.ssa.weekone.assignmentfour.Location;

public class King implements Piece  {

    Location king;

    public King(Location location) {
        this.king = location;
    }

    @Override
    public boolean canMove(Location where) {
        
        if(king.x > 7 || king.x < 0 || king.y > 7 || king.y < 0)
            return false;
        
        
        if(where.x - this.king.x == 1 && where.y - this.king.y == 0)
            return true;
        if(where.x - this.king.x == 0 && where.y - this.king.y == 1)
            return true;
        if(where.x - this.king.x == 1 && where.y - this.king.y == 1)
            return true;
        
        return false;
    }

    @Override
    public int intrinsic() {
        return 13;
    }

    @Override
    public Location where() {
        return king;
    }

    @Override
    public int compareTo(Piece o) {
        if (this.intrinsic() < o.intrinsic())
            return -1;
        if (this.intrinsic() > o.intrinsic())
            return 1;
        
      //if equal, compare to board center
        int p1 = Math.abs(this.king.x - 4) + Math.abs(this.king.y - 4);
        int p2 = Math.abs(o.where().x - 4) + Math.abs(o.where().y - 4);

        if (p1 < p2)
            return 1;
        else if (p1 > p2)
            return -1;
        
        return 0;
    }





}
