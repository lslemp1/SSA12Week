package com.tiy.ssa.weekone.assignmentfour;

import java.util.Arrays;

public class Location {
	
	public final int x, y; 
	int currentX;
	int currentY;
	
	public Location(int x, int y){
		
		this.x = x;
		this.y = y;
	}
		
	
	public int[] move(){
		
		int rand = (int)(Math.random()*8);
		
		switch(rand) {
			case 1: 
				currentX = x + 1; 
				currentY = y + 2;
				break;
			case 2: 
				currentX = x + 2;
				currentY = y + 1;
				break;
			case 3: 
				currentX = x+2;
				currentY = y-1;
				break;
			case 4: 
				currentX = x+1;
				currentY = y-2;
				break;
			case 5: 
				currentX = x-1;
				currentY = y+2;
				break;
			case 6: 
				currentX = x-2;
				currentY = y-1;
				break;
			case 7: 
				currentX = x+1;
				currentY = y-2;
				break;
			case 0: 
				currentX  = x-2;
				currentY = y+1;
				break;
			default:
				break;
	}
	
		getLocation();
		
		if(rand ==0){
			currentX += 1; currentY +=2; getLocation();
			currentX+=2; currentY-=1; getLocation();
			currentX-=1; currentY-=2; getLocation();
		}
		
		if(rand ==1){
			currentX += 2; currentY -=1; getLocation();
			currentX-=1; currentY-=2; getLocation();
			currentX-=2; currentY+=1; getLocation();
		}
		
		if(rand ==2){
			currentX -= 1; currentY +=2; getLocation();
			currentX-=2; currentY-=1; getLocation();
			currentX+=1; currentY-=2; getLocation();
		}
		
		if(rand ==3){
			currentX -= 1; currentY -=2; getLocation();
			currentX-=2; currentY+=1; getLocation();
			currentX+=1; currentY+=2; getLocation();
		}
		
		if(rand ==4){
			currentX -= 2; currentY +=1; getLocation();
			currentX-=1; currentY+=2; getLocation();
			currentX+=2; currentY-=1; getLocation();
		}
		
		if(rand ==5){
			currentX -= 2; currentY -=1; getLocation();
			currentX+=1; currentY-=2; getLocation();
			currentX+=2; currentY+=1; getLocation();
		}
		
		if(rand ==6){
			currentX += 1; currentY -=2; getLocation();
			currentX+=2; currentY+=1; getLocation();
			currentX-=1; currentY+=2; getLocation();
		}
		
		if(rand ==7){
			currentX -= 2; currentY +=1; getLocation();
			currentX-=1; currentY+=2; getLocation();
			currentX+=2; currentY-=1; getLocation();
		}
		
		int[]newPosition = {currentX, currentY};
		return newPosition;
			
	}
	
	public int[] getLocation(){
		int[]newPosition = {currentX, currentY};
		System.out.println("Current Location: "+ Arrays.toString(newPosition));
		return newPosition;
	}
	
	public boolean isHome(){
		if(currentX == x && currentY == y)
			return true;
		else
			return false;
	}
	
	public boolean isValid(){
	    return true;
	}
}