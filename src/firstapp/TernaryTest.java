package firstapp;

public class TernaryTest {
	public static String hello()
	{
		System.out.println("if");
		System.out.println("if");
		System.out.println("if");
		System.out.println("if");
		return "";
	}
	
	public static String greetings()
	{
		System.out.println("if");
		System.out.println("if");
		System.out.println("if");
		System.out.println("if");
		return "";
	}
	
public static void main(String[] args) {
	
	int a= 90, b =100;
	String s = (a<=b)?hello():"else block";
	System.out.println(s);
	
}
}
