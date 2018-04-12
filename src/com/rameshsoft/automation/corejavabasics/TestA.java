package com.rameshsoft.automation.corejavabasics;

class TestB
{
	int a = 90;
	public void greetings() {
		System.out.println("Good Evening");
	}
}

class TestC 
{
	TestB t = new TestB();
	public void access() {
		System.out.println(t.a);
		t.greetings();
	}
}
public class TestA {
public static void main(String[] args) {
	TestC t = new TestC();
	t.access();
	
}
}
