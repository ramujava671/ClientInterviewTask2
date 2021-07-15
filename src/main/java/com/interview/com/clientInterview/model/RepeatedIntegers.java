package com.interview.com.clientInterview.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedIntegers {
	public static Map<Integer,Integer> repNumber(int[] a) {
		Map<Integer,Integer> duplicate=new HashMap<Integer,Integer>();
		

	int n = a.length; 

	HashMap<Integer, Integer> map = new HashMap<>();
	for (int i = 0; i < n; i++) {

		if (map.containsKey(a[i])) {
			int c = map.get(a[i]);
			map.replace(a[i], c + 1);
		} else
			map.put(a[i], 1);
	}
	for (Map.Entry<Integer, Integer> i : map.entrySet()) 
	{
		if (i.getValue() > 1)
			duplicate.put(i.getKey(), i.getValue());
			//System.out.println(i.getKey() + " " + i.getValue());

		else
			continue;
	}
	System.out.println(duplicate.toString());
	return duplicate;
	}
	
	
	
	 public static void main(String[] args) { 
		 int[] a = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 };
		 RepeatedIntegers.repNumber(a);
	 
	 
	 
	 
	 }
	 }