package firstapp;

abstract class TestOneOn
{
	public TestOneOn(int a)
	{
		super();
		System.out.println("Parent class Def constructor");
	}
}

class TestTwo extends TestOneOn
{
	public TestTwo()
	{
		super(90);
		System.out.println("child class constructor");
	}
}
public class AbstractConsTest {
public static void main(String[] args) {
	//TestOneOn one = new TestOneOn();
	TestTwo one = new TestTwo();
}
}



