package demo;

public class Nonrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] number={20,25,20,10,12,15,18,25,10};
	
		for(int i=0;i<number.length;i++)
		{	int count=0;
			for(int j=0;j<number.length;j++)
			{
				if(number[i]==number[j])
				{
					count++;
				}
			}
			if(count==1){
			System.out.println(" Non-reapeating no are "+number[i]);
			}
		}

	}

}
