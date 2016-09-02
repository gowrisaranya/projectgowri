import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 
/* Name of the class has to be "Main" only if the class is public. */
class b1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		System.out.println("enter the n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("positive");
		}
		else if(n<0)
		{
			System.out.println("negative");
		}
		else
		{
		System.out.println("zero");	
		}
	}
}
