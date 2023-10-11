package collection_example;

import java.util.Scanner;

/*Write a Java Switch case program to take the students names 
 * and attendance % of 10 students as input and display 
 * their grades according to the below conditions.
If attendance is above 90 then "A".
If attendance between 90-80 then "B"
If attendance between 80-70 then "C"
If attendance between 70-60 then "D"
If attendance between 60-45 then "E"*/
public class StudentGrade 
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		for(int i=1;i<=10;i++)
		{
			System.out.println("enter name:");
			String name=sc.nextLine();
			System.out.println("enter attendance:");
			int attendance=sc.nextInt();
			sc.nextLine();
			if(attendance>90)
			{
				System.out.println(name+" got A grade");
			}
			else if(attendance>80)
			{
				System.out.println(name+" got B grade");
			}
			else if(attendance>70)
			{
				System.out.println(name+" got C grade");
			}
			else if(attendance>60)
			{
				System.out.println(name+" got D grade");
			}
			else if(attendance>45)
			{
				System.out.println(name+" got E grade");
			}
		}
	}
}

