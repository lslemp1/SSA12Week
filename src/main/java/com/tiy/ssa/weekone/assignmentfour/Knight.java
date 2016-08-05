package com.tiy.ssa.weekone.assignmentfour;

public class Knight {

	LocationRefactored current, home;
	
	
	
public Knight(int x, int y){
		
		home = new LocationRefactored(x, y);
		current = home;
	}
	
public PositionRefactored offset(){
    
}


public LocationRefactored getLocation(){
    return current;
}

public boolean isHome(){
    return current.equals(home);
}


}

