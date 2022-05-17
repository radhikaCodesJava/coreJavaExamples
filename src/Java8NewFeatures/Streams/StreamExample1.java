package Java8NewFeatures.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import Java8NewFeatures.Lambas.Person;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Person> people =Arrays.asList(
				new Person("Charles","Dickers", 60),
				new Person("Lowis","Carol", 54),
				new Person("Thomas","Carlyn", 30),
				new Person("Charollete","Bronte", 20)
				);
		
		people.stream()
		  .forEach(p->System.out.println(p.getFirstName()));
		System.out.println("---");
		people.stream()
		   .filter(p->p.getLastName().startsWith("C"))
		   .forEach(p->System.out.println(p.getLastName()));
		System.out.println("----");
		
		//Stream<Person> st=people.stream();
		long sum= people.stream()
					.filter(p->p.getLastName().startsWith("C"))
					.count();
		
		System.out.println("count is:"+sum);
		
//paralle stream:
		long sum2= people.parallelStream()
				.filter(p->p.getLastName().startsWith("C"))
				.count();
	
	System.out.println("count is:"+sum);
	}

}
