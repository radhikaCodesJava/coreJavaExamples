package Java8NewFeatures.Lambas;

public class Greeter {
	
	public void Greet(Greeting g) {
		g.perform();
	}
	
	
	public static void main(String[] args) {
		Greeter G1=new Greeter();
		//HelloWorldGreeting HWG1 = new HelloWorldGreeting();
		
		
		//Inline anonymus impl class for greeting interface
		Greeting AnonymusClass =new Greeting() {

				public void perform() {
					System.out.println("hi from AnonymusClass");
					System.out.println("Hello world Anonymus class\n");
				}
			};
		
//no need of write impl class  and create obj for it(line 11), 
//if we compare anonymus inner class and lamdas , there are differences btw lamdas and anonymus inner classes.
//lamdas are just not short cut or another way of anonymus inner classes. they both are different completely
//instead  using lamdas we are implementing a function (here perform) of interface greeting 
		
			Greeting myLamdaFunction = ()-> {
				System.out.println("hi from lamda");
				System.out.println("Hello world Lamda\n");
				};
			
						
			//HWG1.perform();
			AnonymusClass.perform();
			myLamdaFunction.perform();
			
			
			G1.Greet(AnonymusClass);
			G1.Greet(myLamdaFunction);
			
			//inline lamda to function greet			
			G1.Greet(()-> {
				System.out.println("hi from lamdaInline");
				System.out.println("Hello world LamdaInline\n");
				});
			
			//arguments
		myLamdaADD addFunction= (int a, int b)-> a+b;
		System.out.println(addFunction.add(2, 3)+ " in add lamda");
		
		//omitting type
		myLamdaADD add1=(p,q)->p+q;
		System.out.println(add1.add(7,2)+" omit type");
		
		//if only one argument is there, then we can omit type information and paranthesis too
		exp1 lengthOfString = str-> str.length();
		System.out.println(lengthOfString.stringLengthMethod("java8Features"));
		
		//using return statement in Inline
		exp1 lengthOfString2 = str->{ return str.length();};
		System.out.println(lengthOfString2.stringLengthMethod("lamdaLength"));
		
		printlength(lengthOfString);
		printlength(s->s.length());
	}
	
	static void printlength(exp1 E) {
		System.out.println(E.stringLengthMethod("sucess"));
	}

}

//functional interface
interface myLamdaADD{
	int add(int x, int y);
}

//functional interface
interface exp1{
	int stringLengthMethod(String s);
	}

 /*class printingLength implements exp1{

	public int stringLengthMethod(String s) {
		return s.length();
	}
}*/