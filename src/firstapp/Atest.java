package firstapp;

interface I1
{
	void m1();
	default void m2(){
		System.out.println("We are providing implementations inside interface");
	}
	public static void greetings(){
		System.out.println("RAMESHSOFT");
	}
	
}

public class Atest implements I1 {
	@Override
	public void m1() {
		System.out.println("m1()");
	}
	@Override
	public void m2(){
		System.out.println("m2()......");
	}
	
	public static void main(String[] args) {
		
		Atest t = new Atest();
		t.m1();
		t.m2();
		I1.greetings();
	}

}
