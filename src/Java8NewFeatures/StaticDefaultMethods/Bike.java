package Java8NewFeatures.StaticDefaultMethods;

public class Bike implements Vehicle{
	int speed;
	int gear;
	int morespeed=6;
	int moreGear =4;
	
	@Override
	public void changeGear(int newGear){
	
	 gear = newGear+moreGear;
	 System.out.println("in changeGear method-bike class " + gear);
	}
	
	public void printStatement() {
		System.out.println("in printStatement- bike class speed: " + speed+ " gear: " + gear);
	

	      }

	

public static void main(String[] args)
{
	Vehicle.applyBrakes(5);
	
	Bike b1= new Bike();
	b1.changeGear(4);
	b1.printStatement();
	b1.speedUp(6);
}
}



