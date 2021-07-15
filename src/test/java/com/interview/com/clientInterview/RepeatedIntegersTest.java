package com.interview.com.clientInterview;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.interview.com.clientInterview.model.RepeatedIntegers;

public class RepeatedIntegersTest {
	
	@Test
	public void repIntegerTest()
	{ 
		int[] a = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 };
		Map<Integer,Integer> dup=new HashMap<Integer,Integer>();
		dup.put(1,3);
		dup.put(4, 3);
		dup.put(6,2);
		RepeatedIntegers repNum= new RepeatedIntegers();
		
		Map<Integer, Integer> listrep=repNum.repNumber(a);
		assertEquals(dup, listrep);
	}

}
