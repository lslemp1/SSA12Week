package com.tiy.ssa.weekone.assignmentthree;

public class PigLatin {

	final String value;
	
	public PigLatin(String value){
		
		this.value = value;
	}
	
public String translate(){
		
		String translation = "";	
		String word = "";
		String[] sentence = value.split(" ");
		
		for(int i =0; i < sentence.length; i++){
			
			sentence[i] = sentence[i].replaceAll(" ", "");
			
			char c = value.charAt(0);
			char b = value.charAt(1);
			
			if(c =='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
				word = value + "way";
				}	
			
				else if (b =='a'|| b=='e'||b=='i'||b=='o'||b =='u'){
				String sub = value.substring(1,value.length());
				word = sub + c + "ay";
				}
				
				else{
				String sub2 = value.substring(2,value.length());
				word = sub2 + c + b + "ay";
			}
			
		}
		return translation += word;
	}
}


