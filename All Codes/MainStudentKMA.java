class MainStudentKMA
{

	public static void main( String[] args)
	{	
	// classname ref_var = new classname()

	StudentKMA s1 = new StudentKMA();
	StudentKMA s2 = new StudentKMA();

	s1.roll = 2;	s1.name = "akshay"; 	s1.sec = "IT";
	s1.displayData();
	s1.attendLecture(" seriously attending the lecture ");

	s2.roll = 22;	s2.name = "om"; 	s2.sec = "CSE";
	s2.displayData();
	s2.attendLecture(" casual approach in the lecture");

	}
}