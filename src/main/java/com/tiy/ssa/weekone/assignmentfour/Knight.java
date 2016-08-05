package com.tiy.ssa.weekone.assignmentfour;

public class Knight {

	final int startX; 
	final int startY; 
	private int positionX;
	private int positionY;
	
	public Knight(int originX, int originY){
		
		this.startX = originX;
		this.startY = originY;
	}
	
	public int[] firstMove(){
		
		int rand = (int)(Math.random()*8);
		
		switch(rand) {
			case 1: 
				positionX = startX + 1;
				positionY = startY + 2;
				break;
			case 2: 
				startX += 2;
				positionY += 1;
				break;
			case 3: 
				positionX += 2;
				positionY += -1;
				break;
			case 4: 
				positionX += 1;
				positionY += -2;
				break;
			case 5: 
				positionX += -1;
				positionY += 2;
				break;
			case 6: 
				positionX += -2;
				positionY += -1;
				break;
			case 7: 
				positionX += 1;
				positionY += -2;
				break;
			case 0: 
				positionX += -2;
				positionY += 1;
				break;
			default:
				break;
	}
		//System.out.println(positionX + "," + positionY);
		
		int[]newPosition = {positionX, positionY};
		System.out.println(newPosition);
		return newPosition;
			
	}
	
	//public int getLocation(){
	//	return newPosition;
	//}
	
	
	//public boolean isValid(){
		
		//int[] moves = {{1,2},{2,1},{2,-1},{1,-2},{-1,2},{-2,-1},{1,-2},{-2,1}};
	//	}
		
	//}
	
}
