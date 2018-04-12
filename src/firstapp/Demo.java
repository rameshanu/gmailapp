package firstapp;

class TestOne extends Object
{
	public TestOne()
	{
		super();
		System.out.println("TestOne constructor");
	}
}

public class Demo extends TestOne{
	final int a;
	public Demo(int a)
	{
		this.a = a;
		System.out.println("1 int parameterised cond :" + a);
		
	}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo('a');
	
	}
}
