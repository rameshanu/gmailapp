package firstapp;

abstract interface One
{
	String name = "RAMESHSOFT";//public static final
	void m1();
	void m2();
	//inner interface
	interface Two
	{
		String trainerName = "RAMESH";
		void m1();
		void m3();
	}
}

class OneImpl implements One
{
	@Override
	public void m1() {
		System.out.println("OI M1()");
	}
	@Override
	public void m2() {
		System.out.println("OI M2()");
	}
	public void hello() {
		System.out.println("hello()");
	}
}
class TwoImpl implements One.Two
{
	@Override
	public void m1() {
		System.out.println("II M1()");
	}
	@Override
	public void m3() {
		System.out.println("II M3()");
	}	
}


class OneTwoImpl implements One,One.Two
{
	@Override
	public void m3() {
		System.out.println("COMMON M3()");
	}
	@Override
	public void m1() {
		System.out.println("COMMON M1()");
	}
	@Override
	public void m2() {
	System.out.println("COMMON M2()");	
	}
	
}

public class InnerInterfaceTest {
public static void main(String[] args) {
	
	One one = new OneImpl(); 
	one.m1();
	one.m2();
	System.out.println(One.name);
	System.out.println(one.name);
	
	One.Two two = new TwoImpl();
	two.m1();
	two.m3();
	System.out.println(two.trainerName);
	System.out.println(One.Two.trainerName);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
