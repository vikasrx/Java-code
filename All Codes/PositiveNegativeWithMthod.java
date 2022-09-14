class PositiveNegativeWithMthod
{
	public static void main(String[] args)
	{
		PositiveNegativeWithMthod.checkPositiveNegative(10);

		PositiveNegativeWithMthod.checkPositiveNegative(-10);

		PositiveNegativeWithMthod.checkPositiveNegative(0);

	}

	static void checkPositiveNegative(int n)
	{

	if( n<0)
		{
		System.out.println(n + " is a negative number ");
		}

	else if(n>0)
		{
		System.out.println(n + " is a positive number ");
		}

	else
		{
		System.out.println(n + " is a zero ");
		}

	}
}