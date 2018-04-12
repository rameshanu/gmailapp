package com.rameshsoft.automation.corejavabasics;

class TestDemo
{
	private int empId = 123;
	
	public int getEmpId()
	{
		return empId;
	}
}

public class TightlyEncpTest {
public static void main(String[] args) {
	
	TestDemo t = new TestDemo();
	int res = t.getEmpId();
	System.out.println("Emp Id is : " + res);
}
}
