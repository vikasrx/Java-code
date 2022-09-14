/*

	*****
	*
	*****
	*
	*****

	for(1-5)
	
	1(12345) 2(12345) 3(12345) 4 5 - 1D Index

	11 12 13 14 15
	21 22 23 24 25
	31 32 33 34 35
	41 42 43 44 45
	51 52 53 54 55




*/


class PaternE
{
	public static void main(String[] args)
	{
		for( int i=1 ; i<=5; i++)
		{
			for( int j =1; j<=5;j++)
			{
			System.out.print("*");

				if(i%2 == 0)
				break;
			}

		System.out.println();
		}
	}
}
	
	