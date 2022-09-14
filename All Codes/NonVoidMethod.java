class NonVoidMethod
{

	static String testTicket(String s)
	{
		if( s.equals("Sachin") || s.equals("Sourav"))
		{
		return "green";
		} 

		else return "red";
	
	}

	public static void main(String[] args)
	{

		System.out.println(testTicket("Sourav"));

/*		if(testTicket("Sourav").equals("green"))
		{
		System.out.println("Allowed");
		}

		else
		{
		System.out.println("NOT Allowed");
		}
*/	
	}
}


//10==10		s1.equals(s2)