
public class RunnableLambda {
  public static void main(String args[])
  {
	  Runnable runnable=new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Inside runnable");
		}
		  
	  };
	  
	  new Thread(runnable).start();
	  
	  Runnable lambda=()->{
		  System.out.println("Inside runnable lambda");
	  };
	  
	  new Thread(lambda).start();
	  
	  
	  Runnable lambdaShort=()->System.out.println("Inside runnable lambda short");
	  
	  new Thread(lambdaShort).start();
	  
	  new Thread(()->System.out.println("Inside runnable lambda shortest")).run();
  }
}
