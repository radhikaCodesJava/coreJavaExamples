package Java8NewFeatures.methodReference;

public class MethodReferenceCollections {

	
	public static void main(String args[]) {
		
		//printMessage();
		
		//Thread t = new Thread(()->printMessage());
		//t.start();
		//t.run();
		
		//method reference :is an alterantive syntax for lamda expression where 
		//the method doesn't take arguments, call function.
		/* so method reference is substituing lamda expression
		 * MethodReferenceCollections::printMessage === ()->printMessage()
		 */
		Thread t = new Thread(MethodReferenceCollections::printMessage);
		t.start();
	}
	
	public static void printMessage() {
		System.out.println("hello");
	}
}
