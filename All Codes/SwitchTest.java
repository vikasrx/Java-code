//		SWITCH CASE :  MENU DRIVEN PROGRAM 

class SwitchTest
{
	
	static void add(int n, int m)
	{
	System.out.println(n+m);
	}

	static void sub(int n, int m)
	{
	System.out.println(n-m);
	}

	
	static void multi(int n, int m)
	{
	System.out.println(n*m);
	}



public static void main(String[] args)
	{

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.println("Enter your choice : ");
	int n = sc.nextInt();
	
	switch(n)
		{
		case 1:
		SwitchTest.add(2,3);
		System.out.println("Monday");
		break;

		case 2:
		SwitchTest.sub(20,13);
		System.out.println("Tuesday");
		break;

		case 3:
		SwitchTest.multi(10,6);
		System.out.println("Wednesday");
		break;

		default :
		System.out.println("Invalid option choosen");
		}
	}
}

