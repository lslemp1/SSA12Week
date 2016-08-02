package com.tiy.ssa.weekone.assignmenttwo;

public class Battery {

	//in kWh
	final float capacity;
	//in kWh
	float leftOver;
	
	public Battery(float capacity){
		
		this.capacity = capacity;
		this.leftOver = capacity;
	}
	
	//charge battery, can't exceed max. capacity
	public float charge(float chargeAmount, float leftOver){
		
		if(leftOver >= capacity){
		return capacity;
		}
		else{
			return leftOver + chargeAmount;
		}
	}

	
	//discharge battery, can't go to negative
	//diff = leftOver - dischargeAmount
	public float discharge(float dischargeAmount, float leftOver){
		
		if(leftOver < 0){
			return capacity;
		}
		else{
			return leftOver-dischargeAmount;
		}
	}
	
}
