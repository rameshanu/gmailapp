package com.rameshsoft.automation.corejavabasics;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a string");
	
	String s = scanner.next();
	System.out.println("After reading from console: " +s);
	
	System.out.println("enter a number");
	int i = scanner.nextInt();
	System.out.println("After reading from console: " +i);
	
	
	
	
	
	
	
	
	
	
	
}
}
