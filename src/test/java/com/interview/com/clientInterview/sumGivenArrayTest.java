package com.interview.com.clientInterview;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import com.interview.com.clientInterview.model.SumGivenArray;

public class sumGivenArrayTest {
	
	@Test
	public void sumArray()
	{  
		int[] arr={7,1,6,4,5,2,8};
		SumGivenArray sumArr=new SumGivenArray();
		int x=sumArr.findThePairs(arr,10);
		assertEquals(10,x);
	}

}
