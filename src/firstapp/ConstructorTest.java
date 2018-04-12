package firstapp;

class ConstructorOne
{
	int id;
	String name;
	
	//parameterised constructor
	public ConstructorOne(int id1,String name1)
	{
		this.id = id1;
		this.name = name1;
		System.out.println(id+"....."+name);
	}
	
}

public class ConstructorTest {
public static void main(String[] args) {
	ConstructorOne one = new ConstructorOne(90,"java");
	
}
}





