package com.tiy.ssa.weekone.assignmentfour;

public class Maths {
	
	public Maths(){
		
	}
	
	public static int logTwo(long num){
		
		int times = 0;
		long reduced = num;
		
		for ( ; reduced >= 2; times++){
			
			reduced = (reduced / 2);
		}
		
		return times;
	}

	
	public static int logThree(long num){
		
		int times = 0;
		long reduced = num;
		
		while(reduced >= 3){
			
			reduced = reduced / 3;
			times++;
		}
		
		return times;
				
		}
		
	}
