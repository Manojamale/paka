package StarPattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="*";
		for (int i=0; i<5;i++)
		{
			System.out.println(s);
			s=s.concat("*");
		}
		
	}

}
