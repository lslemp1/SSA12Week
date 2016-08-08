package com.tiy.ssa.weekone.assignmentfour;

import java.util.Arrays;

public class Location {

    public final int x, y;
    int currentX;
    int currentY;
    int moves = 0;

    public Location(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int[] move() {

        int rand = (int) (Math.random() * 8);

        switch (rand) {
        case 1:
            currentX = x + 1;
            currentY = y + 2;
            break;
        case 2:
            currentX = x + 2;
            currentY = y + 1;
            break;
        case 3:
            currentX = x + 2;
            currentY = y - 1;
            break;
        case 4:
            currentX = x + 1;
            currentY = y - 2;
            break;
        case 5:
            currentX = x - 1;
            currentY = y + 2;
            break;
        case 6:
            currentX = x - 2;
            currentY = y - 1;
            break;
        case 7:
            currentX = x + 1;
            currentY = y - 2;
            break;
        case 0:
            currentX = x - 2;
            currentY = y + 1;
            break;
        default:
            break;
        }

        getLocation();
        moves += 1;

        if (rand == 0) {
            currentX += 1;
            currentY += 2;
            getLocation(); moves++;
            currentX += 2;
            currentY -= 1;
            getLocation(); moves++;
            currentX -= 1;
            currentY -= 2;
            getLocation(); moves++;
        }

        if (rand == 1) {
            currentX += 2;
            currentY -= 1;
            getLocation(); moves++;
            currentX -= 1;
            currentY -= 2;
            getLocation(); moves++;
            currentX -= 2;
            currentY += 1;
            getLocation(); moves++;
        }

        if (rand == 2) {
            currentX -= 1;
            currentY += 2;
            getLocation(); moves++;
            currentX -= 2;
            currentY -= 1;
            getLocation(); moves++;
            currentX += 1;
            currentY -= 2;
            getLocation(); moves++;
        }

        if (rand == 3) {
            currentX -= 1;
            currentY -= 2;
            getLocation(); moves++;
            currentX -= 2;
            currentY += 1;
            getLocation(); moves++;
            currentX += 1;
            currentY += 2;
            getLocation(); moves++;
        }

        if (rand == 4) {
            currentX -= 2;
            currentY += 1;
            getLocation(); moves++;
            currentX -= 1;
            currentY += 2;
            getLocation(); moves++;
            currentX += 2;
            currentY -= 1;
            getLocation(); moves++;
        }

        if (rand == 5) {
            currentX -= 2;
            currentY -= 1;
            getLocation(); moves++;
            currentX += 1;
            currentY -= 2;
            getLocation(); moves++;
            currentX += 2;
            currentY += 1;
            getLocation(); moves++;
        }

        if (rand == 6) {
            currentX += 1;
            currentY -= 2;
            getLocation(); moves++;
            currentX += 2;
            currentY += 1;
            getLocation(); moves++;
            currentX -= 1;
            currentY += 2;
            getLocation(); moves++;
        }

        if (rand == 7) {
            currentX -= 2;
            currentY += 1;
            getLocation(); moves++;
            currentX -= 1;
            currentY += 2;
            getLocation(); moves++;
            currentX += 2;
            currentY -= 1;
            getLocation(); moves++;
        }

        int[] newPosition = {currentX, currentY};
        return newPosition;

    }

    public int[] getLocation() {
        int[] newPosition = { currentX, currentY };
        System.out.println("Current Location: " + Arrays.toString(newPosition));
        return newPosition;
    }

    public boolean isHome() {
        if (currentX == x && currentY == y)
            return true;
        else
            return false;
    }
    
    public int moveNum(){
        return moves;
        }

    public boolean isValid() {
        return true;
    }
}
