package Java8NewFeatures.OverridingDefault;

public interface Creature {
 public void NameofCreature();
 public void CreatureEats();
 
 default void talks() {
	 System.out.println("in talks-Creature");
 }
//public void swims();
}
