package com.interview.com.clientInterview.model;

import java.util.Arrays;

public class SumGivenArray {

	public static int findThePairs(int inputArray[], int inputNumber)
    {
		int output=0;
       // System.out.println("Input Array : "+Arrays.toString(inputArray));
         
        //System.out.println("Input Number : "+inputNumber);
         
        //System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
  
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                   // System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                	output=inputArray[i]+inputArray[j];
                }
            }
        }
         
     return output;
        
    }
  
	/*
	 * public static void main(String[] args) { findThePairs(new int[]
	 * {7,1,6,4,5,2,8},10);
	 * 
	 * 
	 * }
	 * 
	 * public int findThePairs(Object inputArray, int inputNumber) { // TODO
	 * Auto-generated method stub return 0; }
	 */
}
