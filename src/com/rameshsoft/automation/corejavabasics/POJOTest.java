package com.rameshsoft.automation.corejavabasics;

public class POJOTest 
{
private int empId;
private String empName;

public void setEmpId(int empId1)
{
	empId = empId1;
}

public int getEmpId()
{
	return empId;
}

public void setEmpName(String empName)
{
	this.empName = empName;
}

public String getEmpName()
{
	return empName;
}
public static void main(String[] args) {
	
	POJOTest p = new POJOTest();
	p.setEmpId(23);
	System.out.println(p.getEmpId());
	p.setEmpName("JAVA");
	System.out.println(p.getEmpName());;
}
	
}
