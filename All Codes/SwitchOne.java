/*
	Need to write / develop a menu driven program : 

	1. addition of two number 		( method)

	2. multiplication of 3 numbers 		( method)
	
	3. substruction of two numbers 		( method)

	default : other conditions 
*/

class SwitchOne
{

	static void addTwo(int a,int b)
	{
	System.out.println(a+b);
	}

	static void multiThree(int a,int b,int c)
	{
	System.out.println(a*b*c);
	}

	static void subTwo(int a,int b)
	{
	System.out.println(a-b);
	}

	

// ---------------------  main method starting ----------------------


	public static void main(String[] args)
	{
	
	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.println("Enter your choice : ");
	int n = sc.nextInt();

	switch(n)
	{
	case 1 : addTwo(3,7);
		 break;

	case 2: multiThree(1,2,5);
		break;

	case 3: subTwo(20,10);
		break;
	
	default : System.out.print(" Type something between 1-3 only ");
	}

	}
}




		