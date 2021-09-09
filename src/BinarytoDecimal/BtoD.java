package BinarytoDecimal;

public class BtoD {
	
	public static void main(String[] args) {		
	
	int no=1101101, co=0, no1=0;
	
	while (no>0) {
		int rem=no%10;
		
		int y=1;
		
		for (int x=1;x<=co;x++) {
			y=(y*2);
		
			}
		no1=no1+(rem*y);
		no=no/10;
		co++;		
		}
	System.out.println(no1);

	}
}
