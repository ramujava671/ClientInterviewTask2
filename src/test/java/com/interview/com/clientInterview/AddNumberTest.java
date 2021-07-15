package com.interview.com.clientInterview;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import com.interview.com.clientInterview.model.AddNumber;

public class AddNumberTest {
	
	@Test
	public void addnum()
	{
		AddNumber addnum= new AddNumber();
		int  x=addnum.add(20);
		assertEquals(210, x);
	}

}
