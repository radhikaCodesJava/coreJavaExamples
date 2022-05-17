package coreJavaExamples;

import java.io.*;

public class primeOrNot {

	static int var;
	int var2;
	int var3;
	int var4;
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		primeOrNot instance= new primeOrNot();
		primeOrNot.var =8;
		
		instance.var4 = 9;
		
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("enter anumber to check prime or not");

int num= Integer.parseInt(br.readLine());
int count=0;
for(int i=1;i<=num;i++) {
	if(num%i==0)
	{
		count++;
		//static {
			
			//set of statements
		//}
	}
}//end of for
	if(count==2) {
		System.out.println(num +" is a prime");
	}else
		System.out.println(num +" is not prime");

	}//end of main
	
	public void getVariables() {
		
				//
				
		primeOrNot.var= 6;
	}

}//end of class

