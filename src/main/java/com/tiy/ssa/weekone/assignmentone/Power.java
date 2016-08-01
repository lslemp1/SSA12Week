package com.tiy.ssa.weekone.assignmentone;

public class Power {

	final int num;
	
	//initialize the number
	public Power(int num){
		this.num = num;
	}
	
	//1st power
	public int one(){
		return this.num;
	}
	
	//2nd power
	public int squared(){
		return this.num * this.num;
	}
	
	//3rd power
	public int cubed(){
		return squared() * this.num;
	}
}
