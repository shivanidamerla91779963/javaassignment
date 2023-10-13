package anudeep_6058;
import java.util.*;
public class StringShift {

	public static void main(String[] args) 
	{
		System.out.println("enter string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			int j=(int)s.charAt(i);
			if(j>=65 && j<=90)
			{
				j=j-2;
				char c=(char)j;
				sb.append(c);
			}
			if(j>=97 && j<=122)
			{
				j=j-3;
				char c=(char)j;
				sb.append(c);
			}
		}
		System.out.println(sb);
		

	}

}
