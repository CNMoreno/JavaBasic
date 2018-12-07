package com.cnmc.java8.java8cnmc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cnmc.java8.AddCommand;
import com.cnmc.java8.Calculator;
import com.cnmc.java8.Operator;



public class CalculatorUnitTest {

	   

	    @Test
	    public void calculatorMultiply() {
	        Calculator calculator = new Calculator();
	        int result = calculator.calculate(4, 4, Operator.valueOf("MULTIPLY"));
	        assertEquals(16, result);
	        System.out.println(result);
	    }
	    
	    @Test
	    public void calculatorDivide() {
	        Calculator calculator = new Calculator();
	        int result = calculator.calculate(4,2, "divide");
	        assertEquals(2, result);
	        System.out.println(result);
	    }

	    @Test
	    public void calculatorSubtract() {
	        Calculator calculator = new Calculator();
	        int result = calculator.calculate(new AddCommand(17, 7));
	        assertEquals(10, result);
	       System.out.println(result);
	    }
	}


