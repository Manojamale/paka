package findduplicate;

import java.util.HashSet;
import java.util.Set;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array={1, 2,3,1,3,4,2,5};
		
//		Set<Integer> set= new HashSet<Integer>();
//				
//				for (Integer i:array) {
//					
//					if(!set.add(i)) {
//						System.out.println();
//					}
//				}

		for(int i=0;i<array.length;i++){
			int count=0;
			for(int j=0;j<array.length;j++){
				if(array[i]==array[j]&&i!=j) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("nonrepeting no "+array[i]);
			}
			System.out.println("connected with github");
		}
	}

}
