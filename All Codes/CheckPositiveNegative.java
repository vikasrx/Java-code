
// import java.util.*;
class CheckPositiveNegative
{
	public static void main(String[] args)
	{

	// int a = 0;

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter any number to check + or - ");
		int a = sc.nextInt();

		if(a<0)
		{
		System.out.println(" Negative number ");
		}

		else if( a> 0)
		{
		System.out.println(" Positive number ");
		}

		else
		{
		System.out.println(" Zero ");
		}
	}
}
