package Java8NewFeatures.Lambas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Excersize1Java7Solution {
	
	public static void main(String[] args) {
		
		List<Person> ListOfPeople = new ArrayList<Person>();
		ListOfPeople.add(new Person("James","kathy",91));
		System.out.println("printing LOP: "+ListOfPeople);
		ListOfPeople.add(new Person("Macky","Jacky",25));
		System.out.println("printing LOP: "+ListOfPeople);
		List<Integer> marks= new ArrayList<Integer>();
		
		marks.add(34);
		marks.add(80);
		marks.add(51);
		
		System.out.println("Before sort: "+marks);
		//Ascending order:
        Collections.sort(marks); 
        System.out.println("After sort: "+marks);
        
        //Descending order:
		 Collections.sort(marks, Collections.reverseOrder()); 
		 System.out.println("descending sort: "+marks);
		 
		 int[] ints = {11367, 11358, 11421, 11530, 11491, 11218, 11789};
		 Arrays.sort(ints);
		 for(int i:ints)
			 System.out.println("int is:"+i);
		 List l= Arrays.asList(ints);
		 System.out.println("after converting primitive array to list: "+l); //not printing values
		
		List<Person> people =Arrays.asList(
				new Person("Charles","Dickers", 60),
				new Person("Lowis","Carol", 54),
				new Person("Thomas","Carlyn", 30),
				new Person("Charollete","Bronte", 20)
				);
		 //not supported adding this way. people is taken as abstract list.
		//people.add(new Person("James","kathy",91));
		
    //step1: sort by lastName
	Collections.sort(people, new Comparator<Person>() {
	@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getLastName().compareTo(o2.getLastName());
		}
	} );	
	
	//step2: create a method that prints all the elements in the list
	printAll(people);
	//printing without method:
	System.out.println(people);
		
	//step3: create a method that prints all people that have last name begining with c
		peopleWithLastNameBeginsC(people);
		
		//Inline ananonymus class implementation of interface condition
		printWithCondition(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		
		printWithCondition(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
		
		
	//step4: sort by age
					
		
	}//end of main

	public static void printAll(List<Person> p) {
		for(Person per: p) 
			System.out.println(per+"\n");
		}
	
	public static void peopleWithLastNameBeginsC(List<Person> p) {
		for(Person per:p) {
			if(per.getLastName().startsWith("C"))
				System.out.println(per+"\n");
		}
	}
	
	public static void  printWithCondition(List<Person> people, Condition condition) {
		for(Person p: people) {
			if(condition.test(p))
				System.out.println(p);
		}
	}
	
}//end of class

//functional interface
interface Condition{
	boolean test(Person p);
}
