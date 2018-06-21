package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StringHelperTest {
    StringHelper helper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions() {
	String expected = "CD";
	String actual = helper.truncateAInFirst2Positions("AACD");
	assertEquals(expected, actual);
	

    }

    @Test
    public void testTruncateAInFirstPosition() {
	assertEquals("Dummy String","CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateNoA() {
	assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }
    @Test
    public void testTruncate2AInTheEnd() {
	assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }
    
//    ===========================================================================
    @Test
    public void testAreFirstAndLastCharachtersTheSame_BasicNegative() {
	boolean expected = false;
	boolean actual = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
	assertEquals(expected, actual);
//	OR
	assertFalse(actual);
    }
    
    @Test
    public void testAreFirstAndLastCharachtersTheSame_BasicPositive() {
	assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
    
    @Test
    public void testAreFirstAndLastCharachtersTheSame_ABPositive() {
	assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }
    @Test
    public void testAreFirstAndLastCharachtersTheSame_ANegative() {
	assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }
    @Test
    public void testArraySort() {
	int[] actual = {1,4,3,5,2};
	Arrays.sort(actual);
	assertArrayEquals(new int[] {1,2,3,4,5,}, actual);
    }
    @Test(expected=NullPointerException.class)
    public void testArraySort_NullArray() {
	int[] actual = null;	
	Arrays.sort(actual);
	
    }
    @Test(timeout=10000)
    public void performanceTest() {
	int[] actual = {1,4,3,5,2};
	for(int i = 0; i<1000000;i++) {
	    actual[0]+=i;
//	    Arrays.sort(actual);
//	    System.out.println(Arrays.toString(actual));
	}
    }
}
