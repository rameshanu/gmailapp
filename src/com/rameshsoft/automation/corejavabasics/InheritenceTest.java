package com.rameshsoft.automation.corejavabasics;

class InheritOne
{
	public void login(){
		System.out.println("login");
	}
	public void logout() {
		System.out.println("logout");
	}
	public void greetings() {
		System.out.println("good evening");
	}
}

class InheritTwo extends InheritOne
{
	public void display() {
		System.out.println("welcome to RameshSoft");
	}
}


public class InheritenceTest {
public static void main(String[] args) {
	//case1: creating parent class object
	
	InheritOne one = new InheritOne();
	one.login();
	one.logout();
	one.greetings();
	//one.display();
	
	//case2: creating child class object
	InheritTwo two = new InheritTwo();
	two.login();
	two.logout();
	two.greetings();
	two.display();
	
	//case3: we can create child class object by using parent class reference
	InheritOne inheritOne = new InheritTwo();
	inheritOne.login();
	inheritOne.logout();
	inheritOne.greetings();
	//inheritOne.display();
	
	
	
	
	
	
	
	
	
}
}
