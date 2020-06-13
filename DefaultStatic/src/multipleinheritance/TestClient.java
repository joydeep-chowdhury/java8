package multipleinheritance;

public class TestClient implements Interface1,Interface2,Interface3
{
	
	public void methodA() {
		System.out.println("Inside method A"+TestClient.class);
	}
     public static void main(String args[])
     {
    	 TestClient client=new TestClient();
    	 client.methodA();
    	 client.methodB();
    	 client.methodC();
     }
}
