package firstapp;

abstract class A
{
	public abstract void hello();
}

 class TestTest extends A
 {
	@Override
	public void hello() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2);
	}

}
