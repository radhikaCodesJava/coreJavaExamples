package Java8NewFeatures.OverridingDefault;

public class Dog implements Animal,Creature{

	@Override
	public void AnimalCapabities() {
		// TODO Auto-generated method stub -method from animal interface
		System.out.println("in specialCap-Dog-Smell good");
	}

	@Override
	public void AnimalLegs() {
		// TODO Auto-generated method stub -method from animal interface
		System.out.println("I have 4 legs");
	}
	
	//comment this method and observe - this method is present in both interfaces
	@Override
	public void talks() {
		// TODO Auto-generated method stub
		System.out.println("I can only Bark- in Dog");
	}

	//this method is present in creature interface
	@Override
	public void NameofCreature() {
		// TODO Auto-generated method stub
		System.out.println("my name is Dog");
	}

		//this method is present in creature interface
	@Override
	public void CreatureEats() {
		// TODO Auto-generated method stub
		System.out.println("I will eat cats and rats");
	}

	/*@Override
	public void talks() {
		// TODO Auto-generated method stub
		Creature.super.talks();
	}*/

	/*@Override
	public void talks() {
		// TODO Auto-generated method stub
		Animal.super.talks();
	}*/
	

	public static void main(String[] args)
	{
		Dog D1= new Dog();
		
		D1. AnimalCapabities();
		D1.AnimalLegs();
		
		D1.NameofCreature();
		D1.CreatureEats();
		
		D1.talks();
		
		Creature C1 =new Dog();
		Animal A1= new Dog();
		
		C1.CreatureEats();
		C1.NameofCreature();
		//C1.AnimalLegs(); cannot call animal methods
		
		A1.AnimalCapabities();
		A1.AnimalLegs();
		//A1.CreatureEats(); cannot call creature methods
		
		
		A1.talks();
		C1.talks();
	}
	

}
