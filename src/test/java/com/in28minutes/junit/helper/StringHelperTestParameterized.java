package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperTestParameterized {
    private String expectedOutput;
    private String input;
    
    
    public StringHelperTestParameterized(String expectedOutput, String input) {
	super();
	this.expectedOutput = expectedOutput;
	this.input = input;
    }

    StringHelper helper = new StringHelper();
    @Parameters
    public static List<String[]> testConditions() {
	String [][] output = {{"CD", "AACD"},{"CD", "ACD"},{"CDAA", "CDAA"},{"CD", "CD"}};
	return Arrays.asList(output);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
	assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));

    }

    
}
