package com.cybertek;

public class CalculatorEndStuff {
    public int addition(int a, int b) {
	return a+b;
    }
    public int subtraction(int a, int b) {
	return a-b;
    }
    public int division(int a, int b) {
	try {
	return a/b;
	}catch(ArithmeticException ae) {
	   
	   System.out.println("You can't divide by 0...");
	   return 0;
	}
    }
    public int multiplication(int a, int b) {
	return a/b;
    }
//    ============END-STUFF...==================
    public boolean love6(int a, int b) {
	  return (a==6||b==6 || a+b==6 || a-b==6 || b-a==6);
	}
}
