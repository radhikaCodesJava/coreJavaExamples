package Java8NewFeatures.methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import Java8NewFeatures.Lambas.Person;

public class MethodReferenceExample2 {

public static void main(String[] args) {
		
		List<Person> people =Arrays.asList(
				new Person("charles","Dickers", 60),
				new Person("Lowis","Carol", 60),
				new Person("Thomas","Carlyn", 60),
				new Person("Charollete","Bronte", 60)
				);
		
		printWithCondition(people, p->true, p->System.out.println(p));
		/* p->System.out.println(p) == System.out::println
		 * */
		System.out.println("------");
		printWithCondition(people, p->true, System.out::println);
}
	
	public static void  printWithCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p: people) {
			if(predicate.test(p))
				consumer.accept(p);
		}
	}
}
