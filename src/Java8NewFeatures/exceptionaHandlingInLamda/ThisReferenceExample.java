package Java8NewFeatures.exceptionaHandlingInLamda;

public class ThisReferenceExample {

	public void doProcess(int i,Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, (int i)-> {
			System.out.println("value of i :"+i);
			System.out.println(this);
		}
	);
		
	}
	public static void main(String[] args) {
		ThisReferenceExample ref= new ThisReferenceExample();
		
		ref.doProcess(10,new Process() {

			@Override
			public void process(int i) {
				System.out.println("value of anonymus i :"+i);
				System.out.println(this);
			//here this refers to the instance of anonymuc inner class.	
			}
			
		 
		});
		
		ref.doProcess(0, (int i) ->{
			System.out.println("value of i  in doProcess:"+i);
			//System.out.println(this);
			//here this refers to the thisReferenceExample instance which is
			//being accessed in static content, not allowed.
			}
		);

		ref.execute();
	}
	
	//public String toString() {
		//return "this is main";
	//}	
	

}

/* so this in an anonymus inner class overrides with the anonymus inner class instance. 
 /*but in lamda, this is not creating any inner class here, so it will refer to
 outer class instance only. so an error is thrown"this cannot be used in static content*/
