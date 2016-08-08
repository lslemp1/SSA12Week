package com.tiy.ssa.weekone.assignmentfour;

public class PositionRefactored {

    final PositionRefactored origin;
    PositionRefactored current;
    public final int x, y;

    public PositionRefactored(int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.x;
        hash = 23 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    public PositionRefactored(PositionRefactored origin) {
        this.current = this.origin = origin;
    }

    public Location offset(int x, int y) {
        return new Location(this.x + x, this.y + y);
    }

    public PositionRefactored move() {
        if (home())
            return this.current = this.origin.offset(2, 1);
    }

public int knight(location.home){

		this.home = home;
		this.current = home;		
	}

    public boolean isHome() {

        return this.home.equals(this.current);
    }

}
