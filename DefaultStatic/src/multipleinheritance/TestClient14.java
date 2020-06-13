package multipleinheritance;

public class TestClient14 implements Interface1,Interface4{
	public void methodA() {
		System.out.println("Inside method A"+TestClient14.class);
	}
	
	public static void main(String args[])
	{
		TestClient14 client=new TestClient14();
		client.methodA();
	}
}
