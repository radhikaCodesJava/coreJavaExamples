package Java8NewFeatures.Lambas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Excersize1Java8ConsumerSolution {


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
		printWithCondition(people, p->true, p->System.out.println(p));
		
	//step3: create a method that prints all people that have last name begining with c
		printWithCondition(people, p->p.getLastName().startsWith("C"), p->System.out.println(p.getLastName()));
		//we are passing the behaviour to lamda expression here
	}//end of main
	
	/*public static void printAll(List<Person> p) {
		System.out.println(p);
	}*/
	
	public static void  printWithCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p: people) {
			if(predicate.test(p))
				consumer.accept(p);
		}
	}


}
