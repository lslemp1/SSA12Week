package com.tiy.ssa.weekone.assignmentfour;

public class Knight {

    LocationRefactored current, home;

    public Knight(int x, int y) {

        home = new LocationRefactored(x, y);
        current = home;
    }

    public LocationRefactored offset() {

        int moveCount = 0;

        if (isHome())
            return current = home.offset(2, 1);

        // moveTwo = -1,2
        // moveThree = -2,-1
        // moveFour = 1,-2

        return LocationRefactored(x, y);
    }

    public LocationRefactored getLocation() {
        return current;
    }

    public boolean isHome() {
        return current.equals(home);
    }

}
