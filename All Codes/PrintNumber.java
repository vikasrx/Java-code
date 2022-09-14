// Write a java program to print all the numbers between 5-10 ( 5 times  )


 // step 1 - ( create a class )

	class PrintNumber			// creating class
	{
	

		static void repeatLoop()
		{
			for(int i = 5; i<=10; i++)
			{
				if( i%2==0)
				{
				System.out.println(i);
				}			
			}

		}

// as there is no non static properties in this particular class / no need to create object 

		public static void main(String[] args)	// calling main method 
		{
		
// write logic to get the desired output 


		for(int i = 0; i<=2; i++)
		{
			PrintNumber.repeatLoop();
		}


	//	PrintNumber.repeatLoop();PrintNumber.repeatLoop();
	//	PrintNumber.repeatLoop();PrintNumber.repeatLoop();
		


		}
	}