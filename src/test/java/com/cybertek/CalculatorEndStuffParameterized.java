package com.cybertek;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class CalculatorEndStuffParameterized {
    private int input1;
    private int input2;
    private int expectedOutput;
    
//    @BeforeClass
//    public static void Setup() {
//	System.out.println("Before class...");
//    }
    
    public CalculatorEndStuffParameterized(int input1, int input2, int expectedOutput) {
	super();
	this.input1 = input1;
	this.input2 = input2;
	this.expectedOutput = expectedOutput;
	
//	System.out.println("Constructor");
    }
    @Parameters //Collection
    public static List<Integer[]> outParameters() {
//			 {6   ,   6 , 12}
//			 4   +   7 = 11
	Integer ourparams[][]={{6,6,12},{4,7,11},{-5,7,2},{150,7,157},{50,-10,40},{0,0,0}};
	return Arrays.asList(ourparams);
	
    }
    
    
    CalculatorEndStuff ce = new CalculatorEndStuff();
    @Test
    public void additionTest() {
	assertEquals(expectedOutput, ce.addition(input1,input2));
    }
   
}
