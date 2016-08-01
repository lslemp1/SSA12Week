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
				temperature = ((temperature-32)*5) /9;
				return Math.round(temperature);
		}
		
		else if (!isFarenheit && userWantsFarenheit){
			temperature = ((9*(temperature)/5)) + 32;
			return Math.round(temperature);
			}
		
		else{
			return -1;
		}		
	}
	
}
