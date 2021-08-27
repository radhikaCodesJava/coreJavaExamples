package coreJavaExamples;
import java.io.*;
public class oddOrNot {
public static void main(String args[]) throws IOException{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter a number to be checked as ODD or not");
	int a= Integer.parseInt(br.readLine());
	
	if(a%2!=0) {
		System.out.println(a + "is  is odd");
	}else
		System.out.println(a+"is even");
}


}
