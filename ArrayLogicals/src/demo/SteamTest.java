package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SteamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(25);
		l.add(65);
		l.add(45);
		l.add(35);
		
		Integer max=l.stream().max((i, j)->i<j?-1:i>j?1:0).get();
		System.out.println("maximun no is "+max);
		
		Integer min=l.stream().min((i, j)->i<j?-1:i>j?1:0).get();
		System.out.println("minimum no is "+min);
		
		List<Integer> l2=l.stream().sorted().collect(Collectors.toList());
		System.out.println("highest no is "+l2.get(l2.size()-1));
		
		Comparator<Integer> c=(i, j)->i<j?-1:i>j?1:0;
		Collections.sort(l, c);
		System.out.println("min no"+l.get(0));
		System.out.println("max no"+l.get(l.size()-1));
		
		
	}

}
