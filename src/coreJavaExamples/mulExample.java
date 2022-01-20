package coreJavaExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mulExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		
				BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				System.out.println("enter the number , for its table to be displayed");
				int num= Integer.parseInt(br.readLine());
				int r=1;
				for (int i=1; i<=20;i++) 
					System.out.println(num +"X"+ i +"="+ (r=num*i));
				
				
		
	}

}
