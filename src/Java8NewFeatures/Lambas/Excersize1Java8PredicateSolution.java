package Java8NewFeatures.Lambas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Excersize1Java8PredicateSolution {

	public static void main(String[] args) {
		
		List<Person> people =Arrays.asList(
				new Person("charles","Dickers", 60),
				new Person("Lowis","Carol", 60),
				new Person("Thomas","Carlyn", 60),
				new Person("Charollete","Bronte", 60)
				);
		
    //step1: sort by lastName
		Collections.sort(people, (o1, o2)-> o1.getLastName().compareTo(o2.getLastName()));
				
	//step2: create a method that prints all the elements in the list
		//printAll(people);
		printWithCondition(people, p->true);
		
	//step3: create a method that prints all people that have last name begining with c
		printWithCondition(people, p->p.getLastName().startsWith("C"));
		
	}//end of main
	
	/*public static void printAll(List<Person> p) {
		System.out.println(p);
	}*/
	
	public static void  printWithCondition(List<Person> people, Predicate<Person> predicate) {
		for(Person p: people) {
			if(predicate.test(p))
				System.out.println(p);
		}
	}


}
