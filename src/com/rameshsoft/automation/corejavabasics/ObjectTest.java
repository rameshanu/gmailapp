package com.rameshsoft.automation.corejavabasics;

public class ObjectTest {
int id ;
String name;
;;;;
;;;;;
;;;;;;;;
public void display() {
	System.out.println(id+"......"+name);
}
public static void main(String[] args) {
	
	ObjectTest test = new ObjectTest();
	test.display();
	test.id=123;
	test.name="java";
	test.display();
	
	ObjectTest test1 = new ObjectTest();
	test1.display();
	test1.id = 456;
	test1.name = "selen456ium";
	test1.display();
}

}










