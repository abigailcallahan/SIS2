//#2


import java.text.DecimalFormat;


public class Student
	{
		private String firstName;
		private String lastName;
		private String firstPeriod;
		private String secondPeriod;
		private String thirdPeriod;
		private String firstGrade;
		private String secondGrade;
		private String thirdGrade;
		private static String GPA;
		
		

		public Student(String f, String l, String fp, String fg, String sp, String sg, String tp, String tg)
		{
			firstName = f;
			lastName = l;
			firstPeriod = fp;
			secondPeriod = sp;
			thirdPeriod = tp;
			firstGrade = fg;
			secondGrade = sg;
			thirdGrade = tg;
		}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public String getFirstPeriod()
			{
				return firstPeriod;
			}

		public void setFirstPeriod(String firstPeriod)
			{
				this.firstPeriod = firstPeriod;
			}

		public String getSecondPeriod()
			{
				return secondPeriod;
			}

		public void setSecondPeriod(String secondPeriod)
			{
				this.secondPeriod = secondPeriod;
			}

		public String getThirdPeriod()
			{
				return thirdPeriod;
			}

		public void setThirdPeriod(String thirdPeriod)
			{
				this.thirdPeriod = thirdPeriod;
			}

		public String getFirstGrade()
			{
				return firstGrade;
			}

		public void setFirstGrade(String firstGrade)
			{
				this.firstGrade = firstGrade;
			}

		public String getSecondGrade()
			{
				return secondGrade;
			}

		public void setSecondGrade(String secondGrade)
			{
				this.secondGrade = secondGrade;
			}

		public String getThirdGrade()
			{
				return thirdGrade;
			}

		public void setThirdGrade(String thirdGrade)
			{
				this.thirdGrade = thirdGrade;
			}

		public static String getGPA(String a, String b, String c)
			{
			double average = 0;
			String[] grades = {a,b,c};
			for (int i = 0; i < grades.length; i++) {
				if (grades[i].equals("A+")||grades.equals("A")) average += 4.;
				else if(grades[i].equals("A-")) average += 3.67;
				else if(grades[i].equals("B+")) average += 3.33;
				else if(grades[i].equals("B")) average += 3.;
				else if(grades[i].equals("B-")) average += 2.67;
				else if(grades[i].equals("C+")) average += 2.33;
				else if(grades[i].equals("C")) average += 2.;
				else if(grades[i].equals("C-")) average += 1.67;
				else if(grades[i].equals("D+")) average += 1.33;
				else if(grades[i].equals("D")) average += 1.;
				else if(grades[i].equals("D-")) average += .67;
				
			}
			double GPA = (average) / 3;
			DecimalFormat d = new DecimalFormat("0.00");
			return d.format(GPA);
			
				
			}


		
		
		
		
	}