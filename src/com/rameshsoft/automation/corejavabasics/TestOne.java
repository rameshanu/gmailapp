package com.rameshsoft.automation.corejavabasics;

 class TestTwo
{
	 final int a = 90;
	 public String hello() {
		 //a = 900;
		return "Hello";
	}
}

public class TestOne extends TestTwo
{
	@Override
	 public String hello() {
		return "java";
	}
}
