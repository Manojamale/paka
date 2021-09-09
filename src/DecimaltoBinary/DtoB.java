package DecimaltoBinary;

public class DtoB {
	public static void main(String[] args) {
		int no=1745;
		String original="", reverse= "";
		
		while(no>0)
		{	 
			original=original+no%2;
			 no=no/2;
		}
		//System.out.println(original);
		
		
		int length=original.length();
		for (int i= length -1; i>=0; i--) 
		{
			reverse=reverse+original.charAt(i);
		}
		
		System.out.println(reverse);
	}
	}


