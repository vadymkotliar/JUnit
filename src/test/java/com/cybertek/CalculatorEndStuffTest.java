package com.cybertek;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorEndStuffTest {

    @Test
    public void testAddition() {
//	5 + 7  =  12
	int value1 = 5;
	int value2 = 7;
	int expected = 12;
	CalculatorEndStuff calc = new CalculatorEndStuff();
	int actual = calc.addition(value1, value2);
	
	assertEquals(expected, actual);	
//	assertEquals(expected, actual);	
//	assertEquals(expected, actual);	
//	assertEquals(expected, actual);	
    }
    @Test
    public void testAddition_NegativeNums() {
//	-5 + -7  =  12
	CalculatorEndStuff calc = new CalculatorEndStuff();
	assertEquals(-12, calc.addition(-5, -7));	

    }
    
    @Test
    public void testDivision() {
           //    10 / 5 = 2
	int value1 = 10;
	int value2 = 5;
	int expected = 2;
	CalculatorEndStuff calc = new CalculatorEndStuff();
	int actual = calc.division(value1, value2);
    }

}
