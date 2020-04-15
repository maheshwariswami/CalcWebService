package com.myapp.demorest2;

import javax.xml.bind.annotation.XmlRootElement;

public class CalculatorRepository {

	//static Calculator c = null;

	public static Integer calculate(int x, int y, String operation) {

		//c = new Calculator(x, y, operation);
		int result;
		String op;

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
	}

}
