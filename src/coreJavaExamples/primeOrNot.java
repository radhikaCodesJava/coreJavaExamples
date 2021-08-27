package coreJavaExamples;

import java.io.*;

public class primeOrNot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("enter anumber to check prime or not");

int num= Integer.parseInt(br.readLine());
int count=0;
for(int i=1;i<=num;i++) {
	if(num%i==0)
	{
		count++;
	}
}//end of for
	if(count==2) {
		System.out.println(num +" is a prime");
	}else
		System.out.println(num +" is not prime");

	}//end of main

}//end of class

