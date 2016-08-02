package com.tiy.ssa.weekone.assignmentone;

public class Thermometer {

	int temperature;
	boolean isFarenheit;
	
	//initialize temperature to farenheit
	public Thermometer (int temperature){
		this(temperature, true);
	}
	
	//pass parameters for thermometer
	public Thermometer(int temperature, boolean isFarenheit){
		this.temperature = temperature;
		this.isFarenheit = isFarenheit;
	}
	
	//figure out if users wants farenheit & follow appropriate conversions
	public int display (boolean userWantsFarenheit){
	
		if(userWantsFarenheit == this.isFarenheit){
			return this.temperature;
		}
		
		else if (isFarenheit && !userWantsFarenheit){
				return ((temperature-32)*5) /9;
		}
		
		else if (!isFarenheit && userWantsFarenheit){
			return ((9*(temperature)/5)) + 32;
			}
		
		else{
			return -1;
		}		
	}
	
}
