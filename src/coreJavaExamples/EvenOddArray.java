package coreJavaExamples;
import java.util.*;

public class EvenOddArray {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList arl= new ArrayList<>();
			arl.add(5);
			arl.add(8);
			arl.add(20);
			arl.add(23);
			
			System.out.println(arl);
			Object arr2[]= arl.toArray();
		
			
			
			System.out.println(arr2);
			//for( k:arr2)
				//System.out.println(k);
			
			
			
			
			
			/*int [] a = {5,8,20,23};
			int [] even = new int[10];
			int [] odd = new int[10];
			int cnt_even =0;
			int cnt_odd =0;
			
			for(int j:a)
			{
				if(j%2==0)
				{
					System.out.println("The number is even");
					even[cnt_even] = j;
					cnt_even++;
					//System.out.println(even[cnt_even] + j);
					System.out.println("the even is:"+  j);
				}
				else
				{
					System.out.println("The number is odd");
					odd[cnt_odd] = j;
					cnt_odd++;
					System.out.println("the odd is:"+ odd[cnt_odd]+ j);
				}
			}*/
			
			//System.out.println(even + "\n" + odd) ;
			
			/*for(int i=0; i<cnt_even; i++)
			System.out.println(even[i]);
			System.out.println("its length is:"+cnt_even );
			
			for (int j=0;j<cnt_odd;j++)
				System.out.println(odd[j]);
			System.out.println("its length is:"+cnt_odd );*/
			
			/*for (int i:even)
				System.out.println(i);

			for (int j:odd)
				System.out.println(j);*/
			
		}

}
