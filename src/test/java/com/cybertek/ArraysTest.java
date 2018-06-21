package com.cybertek;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTest {

    @Test
    public void testArraySort_RandomArray() {
	int [] actual = {1,5,2,4,3};
	 Arrays.sort(actual);
	 int[] expected = {1,2,3,4,5};
	
//	 assertEquals(expected, actual);
	assertArrayEquals(expected, actual);
	
    }
    
    @Test(expected=NullPointerException.class)
    
    public void testArraySort_NullArray() {
	int [] actual = null;
	Arrays.sort(actual);
	
//	try {
//	    
//	}catch(NullPointerException exc) {
//	    
//	}
	
    }
    
    @Test(timeout = 3000)
    public void testSort_Performance() {
	int [] array = {1,55,74,134,42};
	
	for(int i = 0; i <=100000000; i++) {
	    array[0]=i;
	    Arrays.sort(array);
	}
    }

}
