package com.tiy.ssa.weekone.assignmentthree;

public class PigLatin {

	final String value;
	
	public PigLatin(String value){
		
		this.value = value;
	}
	
public String translate(){
		
		String translation = "";	
		String[] sentence = value.split(" ");
		
		for(int i =0; i < sentence.length; i++){
			
			sentence[i] = sentence[i].replaceAll(" ", "");
			String word = "";
			String locate = sentence[i];
			char c = locate.charAt(0);
			char b = locate.charAt(1);
			
			//begins with vowel
			if(c =='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
				word = locate + "way";
				}	
			
				//begins with consonant
				else if (b =='a'|| b=='e'||b=='i'||b=='o'||b =='u'){
				String con1 = locate.substring(0,1);
				String sub = locate.substring(1,locate.length());
				word = sub + con1 + "ay";
				}
				
				//begins with 2 consonants
				else{
				String con2 = locate.substring(0,2);
				String sub2 = locate.substring(2,locate.length());
				word = sub2 + con2 + "ay";			
			}			
			
		if (i==0)
			translation += word;
		else
			translation = translation + " " + word;
		
		}
		return translation;
	}
}


