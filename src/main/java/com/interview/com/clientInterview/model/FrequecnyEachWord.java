package com.interview.com.clientInterview.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequecnyEachWord {

	
	 public String eachWord(String str2)
	    {
		
	       // String str = "Alice is girl and Bob is boy";
		 String str=str2;
	       
	        Map<String, Integer> hashMap = new HashMap<>();
	  
	       
	        String[] words = str.split(" ");
	  
	        for (String word : words) {
	            Integer integer = hashMap.get(word);
	  
				
				 if (integer == null)
				 
				 hashMap.put(word, 1);
				 
				 else {
				 
				  hashMap.put(word, integer + 1); 
				  }
				 
	          
	        }
	       // System.out.println(hashMap);
			
 return hashMap.toString();
	}
	/*
	 * public static void main(String[] arg) { FrequecnyEachWord fe=new
	 * FrequecnyEachWord(); fe.eachWord("Alice is girl and Bob is boy"); }
	 */
}