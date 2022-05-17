package Java8NewFeatures.StaticDefaultMethods;

class Bicycle implements Vehicle{

   int speed;
   int gear;
   int morespeed =2;
   int moreGear =4;
   
// to change gear
  @Override
 public void changeGear(int newGear){

   gear = newGear+moreGear+newGear;
   System.out.println("in changeGear of Bicycle "+ gear);
  }

  //overriding default method from interface
@Override
public void speedUp(int increment){

       speed = speed+increment+morespeed;
       System.out.println("in speed up-Bicycle "+ speed);
}

//static methods cannot be overridden
/*@Override
public void applyBrakes(int decrement){

speed = speed-decrement;
    }*/

public void printMessage() {
System.out.println("in pritnMessage-Bicycle");
System.out.println("speed: "+ speed+" gear: "+ gear);
}

public static void main(String[] args)
{
	Vehicle.applyBrakes(7);
	Bicycle B1= new Bicycle();
	B1.speedUp(5); //overidded default method
	B1.printMessage();
}


}
