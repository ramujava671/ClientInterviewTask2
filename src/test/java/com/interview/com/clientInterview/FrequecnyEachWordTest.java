package com.interview.com.clientInterview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.interview.com.clientInterview.model.FrequecnyEachWord;

public class FrequecnyEachWordTest {
	
	@Test
	public void eachWord()
	{ 
		String str1="Alice is girl and Bob is boy";
		FrequecnyEachWord few=new FrequecnyEachWord();
		String str=few.eachWord(str1);
		System.out.print(str);
		assertEquals("Bob=1, Alice=1, and=1, is=2, girl=1, boy=1", str);
	}

}
