package Java8NewFeatures.Lambas;

public class FunctionalInterfaceRunnable {

	
	public static void main(String args[]) {
		
		//Inline anonymuc impl class for runnable interface
		Thread newThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("in run method of anonymys inner class");
				}
		});
		
		newThread.run();
		
		//lamda expression for run method, Runnable is a functional interface
		Thread LamdaThread = new Thread(()-> System.out.println("in lamda run method"));
		LamdaThread.run();
	}
}
