package Java8NewFeatures.OverridingDefault;

public interface Animal {
	public void AnimalCapabities();
	
	public void AnimalLegs();
	
	default void talks()
	{
		System.out.println("in talks-animal");
	}
	
	

}
