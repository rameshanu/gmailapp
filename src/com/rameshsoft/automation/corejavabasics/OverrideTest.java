package com.rameshsoft.automation.corejavabasics;

class OverrideOne
{
	public void greetings() {
		System.out.println("Good Evng");
	}
	public void testing() {
		System.out.println("MANUAL TESTING");
	}
}

class OverrideTwo extends OverrideOne
{
	@Override
	public void testing() {
		System.out.println("AUTOMATION TESTING");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		
		/*OverrideOne one = new OverrideOne();
		one.greetings();
		one.testing();
		
		
		OverrideTwo two = new OverrideTwo();
		two.testing();
		two.greetings();*/
		
		
		OverrideOne one = new OverrideTwo();
		one.greetings();
		one.testing();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
