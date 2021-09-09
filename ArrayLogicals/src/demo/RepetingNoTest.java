package demo;

import java.util.HashSet;
import java.util.Set;

public class RepetingNoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] numbers={20,25,20,10,12,15, 15,18,25,10};

		Set<Integer> nos=new HashSet<Integer>();
		for(Integer no:numbers)
		{
			if(!nos.add(no))
			{
				System.out.println("Repeating no are "+no);
			}
		}
		
		
		
		
//		for(int i=0;i<number.length;i++)
//		{	
//			for(int j=0;j<number.length;j++)
//			{
//				if(number[i]==number[j]&&i!=j)
//				{
//					System.out.println("reapeating no are "+number[i]);
//				}
//			}
//		}


	}

}
