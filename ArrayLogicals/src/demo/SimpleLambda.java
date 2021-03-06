package demo;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

//@FunctionalInterface
interface Intraf{
//	int square(int a);
	static void m1() {
		System.out.println("m1 Static Intraf");
	}
	default void m2() {
		System.out.println("m2 default Intraf");
	}
}
public class SimpleLambda implements Intraf{
	
//	public int square(int a) {
//		return a*a;
//	}

	public static void main(String[] args) {
		Intraf l=new SimpleLambda();
		l.m2();
		Intraf.m1();
		
		Predicate<Integer> p=i-> i>18;
		System.out.println(p.test(15));
		System.out.println(p.test(25));
		
		Function<Integer, Integer> s=i->i*i;
		System.out.println("square is "+s.apply(5));
		System.out.println("square is "+s.apply(25));
		
//		Intraf s=i->i*i;
//		System.out.println("square is "+s.square(5));
//		System.out.println("square is "+s.square(25));
		
		
//		SimpleLambda s=new SimpleLambda();
		
//		System.out.println(s.square(5));
//		System.out.println(s.square(6));
	}

}
