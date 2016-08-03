package com.tiy.ssa.weekone.assignmenttwo;

public class Battery {

	//in kWh
	final float capacity;
	//in kWh
	float leftOver;
	
	public Battery(float capacity, float leftOver){
		
		this.capacity = capacity;
		this.leftOver = leftOver;
		
	}
	
	public float getCapacity(){
		return this.capacity;
	}
	
	public float getRemaining(){
		return this.leftOver;
	}
	
	//charge battery, can't exceed max. capacity
	public float charge(float chargeAmount){
		
		if(leftOver >= capacity || (leftOver+chargeAmount) >= capacity){
		return capacity;
		}
		else{
			return leftOver + chargeAmount;
		}
	}

	//discharge battery, can't go to negative
	public float discharge(float dischargeAmount){
		
		if(leftOver < 0 || (leftOver-dischargeAmount) < 0){
			return 0;
		}
		else{
			return leftOver-dischargeAmount;
		}
	}
	
	//prints out time usage remaining	
	//kW * hour = kWh; remaining time in minutes = (kWh/kW) *60
	public int howLong(float power){
		
		if(leftOver > 0 && leftOver <= capacity){		
		int remaining = (int) ((leftOver/power)*60);
		return remaining;
	}
		else{
			return 0;
		}
	}
	
}
