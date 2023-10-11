package collection_example;

public class OddProgram 
{
	
	
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=7;i<=21;i++)
		{
		if(i%2!=0)
		{
		sum+=i;
		}
		}
		System.out.println("sum of odd numbers between 7 and 21 is:"+sum);
	}
}
