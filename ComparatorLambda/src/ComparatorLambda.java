import java.util.Comparator;

public class ComparatorLambda {
	public static void main(String args[]) {
        Comparator<Integer> comparator=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
        	
        };
        
        System.out.println("Result of comparator is "+comparator.compare(5, 4));
        
        Comparator<Integer> comparatorLambda=(a,b)-> a.compareTo(b);
        
        System.out.println("Result of comparator using lambda is "+comparatorLambda.compare(5, 4));
        
	}
}
