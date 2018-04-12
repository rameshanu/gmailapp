package com.rameshsoft.automation.corejavabasics;

class OverloadOne
{
	public int add(int a,int b) {
		System.out.println("int int");
		int result = a + b;
		return result;
	}
	
	public float add(int a,float b) {
		System.out.println("int float");
		float result = a + b;
		return result;
	}
	public double add(double a,double b) {
		System.out.println("double double");
		double result = a + b;
		return result;
	}
}

public class OverloadTest {
public static void main(String[] args) {
	OverloadOne one = new OverloadOne();
	System.out.println(one.add(10, 20));;
	
	System.out.println(one.add(12.36f, 25.56f));;
	
	/*System.out.println(one.add(12.36, 10.44));;
	
	System.out.println(one.add(12, 12.36f));;
	
	System.out.println(one.add('a', 'b'));;
	*/
	
	
	
	
	
	
	
	
}
}
