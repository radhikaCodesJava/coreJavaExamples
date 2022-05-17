package Java8NewFeatures.methodReference;

import java.util.Arrays;
import java.util.List;

import Java8NewFeatures.Lambas.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people =Arrays.asList(
				new Person("charles","Dickers", 60),
				new Person("Lowis","Carol", 60),
				new Person("Thomas","Carlyn", 60),
				new Person("Charollete","Bronte", 60)
				);
		//external iterators for loop and for-each loop
		//for loop
		for(int i=0; i<people.size();i++) {
			System.out.println(people.get(i));
		}
		System.out.println("----");
		//for-each loop
		for(Person p: people) {
			System.out.println(p);
		}
		
		System.out.println("----");
		//internal iterator
		people.forEach(p->System.out.println(p));
		
		System.out.println("----");
		//method reference
		people.forEach(System.out::println);
		

	}

}
