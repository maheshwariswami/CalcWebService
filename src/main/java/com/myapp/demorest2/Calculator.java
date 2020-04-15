package com.myapp.demorest2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Calculator {

	int number1;
	int number2;
	String operation;
	int result;
	public Calculator(int x, int y, String operation2) {
		// TODO Auto-generated constructor stub
		this.number1=x;
		this.number2=y;
		this.operation=operation2;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Calculator [number1=" + number1 + ", number2=" + number2 + ", operation=" + operation + ", result="
				+ result + "]";
	}
	
	
}
