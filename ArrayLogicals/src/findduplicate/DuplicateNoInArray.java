package findduplicate;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class DuplicateNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array= {10,20,30,40,55,66,77,10,20,55,77,40};
		Stream.of(array).sorted().forEach(System.out::println);
//		Set<Integer> s=new HashSet<Integer>();
//		for (Integer number : array) {
//			if(!s.add(number)) {
//				System.out.println("Duplicate Number "+ number);
//			}
//		}
		
		for(int i=0 ; i< array.length; i++ ) {
			for(int j=i+1 ; j< array.length; j++ ) {
				if(array[i]==array[j]) {
					System.out.println("Duplicate Number is "+array[i]);
				}
			}
		}
	}

}
