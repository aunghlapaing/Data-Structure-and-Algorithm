package com.programming.turing_dsa.data_structure;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class DelimiterTest {
	DelimiterPratice delimiter = new DelimiterPratice();
	@ParameterizedTest
	@CsvSource({
			"'', True", 
			"a[b], True",
			"a{b, False",
			"a{b}c], False",
			})
	public void testDelimiter(String input, boolean expected) {
		System.out.println("Input:" + input + " and" + "Output:" + expected);
	    boolean valid = delimiter.isValid(input);
	    assertEquals(expected, valid);
	}

}
