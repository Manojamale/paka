package SquareRoot;

public class SquareRoot {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a=0;
		for  (int  i=1;i*i<=n;i++) {
			
			if (n%i==0)
			{
				a=i*i;
			if (a==n) {
				System.out.println("Square Root of "+n+" is "+i);
				
				}
			}
		}
		
	}

}
