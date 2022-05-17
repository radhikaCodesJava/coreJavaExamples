package Java8NewFeatures.StaticDefaultMethods;

public interface Vehicle {
		   
		// all are the abstract methods by default.
		
		 public void changeGear(int a);
		
		 //this is an default method
		 default void speedUp(int a) {
			 System.out.println("speedup-I'm default of vehicle i/f");
		 }
		
		 //this is an static method
		public static void applyBrakes(int a) {
			System.out.println("apply Brakes-I'm  in static of vechicle");
		}

		//versionize with sensor lights method
		

}
