
import java.util.*;
class MethodTest2
{
	
	static void getTable(int n)
	{
		for(int i = 1;i<=10; i++)
		{
		System.out.print(n*i + " ");
		}

	}


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 numbers to get table : ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int no3 = sc.nextInt();


		MethodTest2.getTable(no1 );

		System.out.println();
	
		MethodTest2.getTable(no2 );
		
		System.out.println();

		MethodTest2.getTable(no3 );
	}
}