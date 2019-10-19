package com.rhythm;

public class LongestWordNSizeInstnce {
	public String[] LongestWordInSentence(String Str) {
		
		if(Str==null || Str.isEmpty())
			throw new RuntimeException("String is empty");
		String word[]=new String[2];
		if((Str.length()==0)||(Str.length()==1)) {
			word[0] = Str;
			word[1] = Integer.toString(Str.length());
			return word;
		}
			
		
		String strTemp[] = Str.split(" ");
		word[0] = strTemp[0];
		word[1] = Integer.toString(strTemp[0].length());
		for(int ii=0;ii<strTemp.length;ii++) {
			if(word[0].length()<strTemp[ii].length()) {
				word[0] = strTemp[ii];
				word[1] = Integer.toString(strTemp[ii].length());
			}
				
		}
		return word;
	}

}
