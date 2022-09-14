class StudentKMA
	{
			// var , method , constructor , block , class 
	
	int roll;
	String name;
	String sec;

	static String college_name="KMA";


	void displayData()
	{
	System.out.println(" name : " +name);
	System.out.println(" roll : " +roll);
	System.out.println(" sec : " + sec);
	}

	void attendLecture(String s)
	{
	System.out.println(name  + " " + s);
	}

	static void appearExam()
	{
	System.out.println(" Exam giving seriously ");
	}

	void eventParticipation(String s)
	{
	System.out.println(s);
	}


	}