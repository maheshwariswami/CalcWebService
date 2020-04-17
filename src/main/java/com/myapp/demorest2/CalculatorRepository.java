package com.myapp.demorest2;

import javax.xml.bind.annotation.XmlRootElement;

public class CalculatorRepository {

	//static Calculator c = null;

	public static long calculate(long x, long y, String operation) {

		//c = new Calculator(x, y, operation);
		long result;
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
		} else {
			// defaults to zero
			result = 0;
			
		}

		//c.setResult(result);
		//System.out.println(c);
		//return c;
		return result;
		}catch(Exception e)
		{
			System.out.println("Invalid data combination is used "+x+" "+y+" "+operation);
			e.printStackTrace();
			return 0;
		}
	}
	
	public static double calculate(double x, double y, String operation) {

		//c = new Calculator(x, y, operation);
		double result;
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
		} else {
			// defaults to zero
			result = 0;
			
		}

		//c.setResult(result);
		//System.out.println(c);
		//return c;
		return result;
		}catch(Exception e)
		{
			System.out.println("Invalid data combination is used "+x+" "+y+" "+operation);
			e.printStackTrace();
			return 0;
		}
	}

}
