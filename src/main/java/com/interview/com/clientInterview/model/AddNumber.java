package com.interview.com.clientInterview.model;

public class AddNumber {
    public static int add(int number)
     {
		//int number = 5;
        int sum = addNumbers(number);
        //System.out.println("Sum = " + sum);
        return  sum;
       }

    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }

	}


