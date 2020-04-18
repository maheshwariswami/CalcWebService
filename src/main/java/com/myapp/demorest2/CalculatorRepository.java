package com.myapp.demorest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

public class CalculatorRepository {
	static List<String> operation = Arrays.asList("ADD","SUB","MULT","DIV");

	//static Calculator c = null;

	public static long calculate(long x, long y, String operation) {
		System.out.println("Long function calculate");

		//c = new Calculator(x, y, operation);
		long result = 0;
		String op;
		try {
		if ("ADD".equalsIgnoreCase(operation)) {
			result = x + y;
			op = "+";
		} else if ("SUB".equalsIgnoreCase(operation)) {
			result = x - y;
			op = "-";
		} else if ("MULT".equalsIgnoreCase(operation)) {
			result = x * y;
			op = "*";
		} else if ("DIV".equalsIgnoreCase(operation)) {
			result = x / y;
			op = "/";
		}

		//c.setResult(result);
		//System.out.println(c);
		//return c;
		return result;
		}catch(Exception e)
		{
			System.out.println("Invalid data combination is used "+x+" "+y+" "+operation);
			e.printStackTrace();
			return -1;
		}
	}
	
	public static double calculate(double x, double y, String operation) {
		System.out.println("Double function calculate");
		//c = new Calculator(x, y, operation);
		double result = 0;
		String op;
		try {
		if ("ADD".equalsIgnoreCase(operation)) {
			result = x + y;
			op = "+";
		} else if ("SUB".equalsIgnoreCase(operation)) {
			result = x - y;
			op = "-";
		} else if ("MULT".equalsIgnoreCase(operation)) {
			result = x * y;
			op = "*";
		} else if ("DIV".equalsIgnoreCase(operation)) {
			result = x / y;
			op = "/";
		} 

		//c.setResult(result);
		//System.out.println(c);
		//return c;
		return result;
		}catch(Exception e)
		{
			System.out.println("Invalid data combination is used "+x+" "+y+" "+operation);
			e.printStackTrace();
			return -1;
		}
	}

}
