package com.dsa.learning.dataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PostFixConverterTest {
	
	PostFixConverter converter = new PostFixConverter();
	
	@Test
	public void simpleInfixtoPostfixCase()
	{
		String infix = converter.toPostfix("a+b");
		assertEquals("ab+", infix);
	}
	
	@Test
	public void simpleMultipleOperatorCase()
	{
		String infix = converter.toPostfix("a-b+c");
		assertEquals("ab-c+", infix);
		assertEquals("ab-c+d+", converter.toPostfix("a-b+c+d"));
	}
	
	@Test
	public void differentMultipleOperatorCase()
	{
		String infix = converter.toPostfix("a*b+c");
		assertEquals("ab*c+", infix);
	}
	
	@Test
	public void reverseOperatorPrecedenceCase()
	{
		String infix = converter.toPostfix("a+b*c");
		assertEquals("abc*+", infix);
	}
	
	@Test
	public void simpleParenthesisCase()
	{
		String infix = converter.toPostfix("a*(b-c)");
		assertEquals("abc-*", infix);
		assertEquals("ab-c*", converter.toPostfix("(a-b)*c"));
	}
	
	
	

}
