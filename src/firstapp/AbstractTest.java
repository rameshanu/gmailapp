package firstapp;

 abstract class AbstractOne
{
	public void cashwithdraw() {
		System.out.println("cashwithdraw");
	}
	public void ministmt() {
		System.out.println("ministsmt");
	}
	
	public abstract void cashdeposit();
	public abstract void pinchange();
}

abstract class AbstractTwo extends AbstractOne
{
	//abstract public void ministmt();
	@Override
	public void cashdeposit()
	{
		System.out.println("cashdeposit");
	}
	;;;;;;;;;;;;;;;;;;;
}

class AbstractThree extends AbstractTwo
{
	@Override
	public void pinchange() {
		System.out.println("pin change");
	}
	
}


public class AbstractTest {
public static void main(String[] args) {
	
	//AbstractOne one = new AbstractOne();
	//AbstractTwo two = new AbstractTwo();
	
	AbstractThree three = new AbstractThree();
	three.cashdeposit();
	three.cashwithdraw();
	three.ministmt();
	three.pinchange();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
