package Java8NewFeatures.OverridingDefault;

public class Monkey extends LivingBeing implements Animal{

	@Override
	public void AnimalCapabities() {
		// TODO Auto-generated method stub
		System.out.println("i have very long tail");
	}

	@Override
	public void AnimalLegs() {
		// TODO Auto-generated method stub
		System.out.println("i have 2 legss");
	}

	@Override
	public void talks() {
		// TODO Auto-generated method stub
		System.out.println("I cannot talk");
	}

	@Override
	public void LivingBeingMovement() {
		// TODO Auto-generated method stub
		System.out.println("i Jump-in Monkey class");
	}
	public static void main(String[] args)
	{
		Monkey M1= new Monkey();
		
		M1. AnimalCapabities();
		M1.AnimalLegs();
		
		M1.LivingBeingMovement();
		
		M1.talks();
		
		LivingBeing LB1 =new Monkey();
		Animal A1= new Monkey();
		
		LB1.LivingBeingMovement();
		
		A1.AnimalCapabities();
		A1.AnimalLegs();
		
		A1.talks();
		LB1.talks();
	}
}
