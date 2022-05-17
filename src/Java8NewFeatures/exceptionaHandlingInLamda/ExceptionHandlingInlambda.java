package Java8NewFeatures.exceptionaHandlingInLamda;

import java.util.function.BiConsumer;

public class ExceptionHandlingInlambda {

	public static void main(String[] args) {
		int[] someNumbers= {1,2,3,4};
		int key=0;
		
		process(someNumbers, key,wrapperLamda((v,k)->System.out.println(v/k)));

}
 private static void process(int[] someNumbers,int key,BiConsumer<Integer,Integer> consumer) {
	 for(int i:someNumbers) {
		// System.out.println(i+key);
		 consumer.accept(i, key);
	 }
 }
 
 private static BiConsumer<Integer,Integer> wrapperLamda(BiConsumer<Integer,Integer> consumer) {
	 //return consumer;
	 return (v,k)->{
		 try {
			 consumer.accept(v,k);
			  }catch(ArithmeticException e) {
				  System.out.println("Exception caught in wrapper Lamda");
			  }
	 };
 }
}

