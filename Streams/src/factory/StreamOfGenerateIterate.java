package factory;

import java.util.Random;
import java.util.stream.Stream;

public class StreamOfGenerateIterate {
  public static void main(String args[])
  {
	  Stream<String> stream=Stream.of("Joydeep","Arunabha","Ankit","Sachin","Kaustav");
	  stream.forEach(System.out::println);
	  Stream.iterate(1, x->x*3).limit(10).forEach(System.out::println);
	  Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
  }
}
