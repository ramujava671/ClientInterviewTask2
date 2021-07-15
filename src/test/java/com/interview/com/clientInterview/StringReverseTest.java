package com.interview.com.clientInterview;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.interview.com.clientInterview.model.StringReverse;

public class StringReverseTest {
	
	@Test
	public void test()
	{
		StringReverse stringRevserse=new StringReverse();
		String str=stringRevserse.reverse("Raman chaitra");
		assertEquals("artiahc namaR",str);
		
	}

	

}
