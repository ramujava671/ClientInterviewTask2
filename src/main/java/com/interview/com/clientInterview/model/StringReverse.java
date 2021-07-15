package com.interview.com.clientInterview.model;

public class StringReverse {
	public static String reverse(String str) { 
		   if(str.length() == 0) 
		     return ""; 
		   return str.charAt(str.length() - 1) +    reverse(str.substring(0,str.length()-1)); 
		   } 

	 
			
//			 public static void main(String []arg) {
//			 System.out.print(StringReverse.reverse("java python"));
//
//			 }
	
	
	
			 
}
