package firstapp;

class OuterOne
{
	public void hello()
	{
		System.out.println("OUTER HELLO()");
	}
	//static inner class
	static class InnerOne
	{
		int id = 123;
		public void hello()
		{
			System.out.println("INNER HELLO()");
		}
		static public void greetings() {
			System.out.println("INNER GREETINGS");
		}		
	}
}
public class StaticInnerTest {
public static void main(String[] args) {
	
	OuterOne one = new OuterOne();
	one.hello();
	
	
	OuterOne.InnerOne innerOne = new OuterOne.InnerOne();
	innerOne.hello();
	innerOne.greetings();
	
	System.out.println(innerOne.id);
	
	OuterOne.InnerOne.greetings();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}