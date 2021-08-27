package coreJavaExamples;

import java.io.*;

public class printUpToOdd {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a number till that number odds are printed");
int a= Integer.parseInt(br.readLine());

	for (int i=1;i<=a;i=i+2) {
		System.out.println(i);
	}//end of for
	}//end of main

}//end of class
