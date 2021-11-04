import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

//#2

public class AddDeleteStudent
	{
		static Scanner intInput = new Scanner(System.in);
		static Scanner stringInput = new Scanner(System.in);
		static int answer;
		static String first;
		static String last;
		static int firstP;
		static int secondP;
		static int thirdP;
		static String firstG;
		static String secondG;
		static String thirdG;
		static String deleteLast;
		
		static String string1P;
		static String string2P;
		static String string3P;


		
		public static void addDelete() throws IOException
			{
				RunSIS.fillArrayList();
				System.out.println("Would you like to: ");
				System.out.println("1) Add a Student");
				System.out.println("2) Delete a Student");
				System.out.println("3) Go back to Main Menu");
				answer = intInput.nextInt();
				
				if(answer == 1)
					{
						addStudent();
					}
				else if(answer == 2)
					{
						deleteStudent();
						
					}
				
				else if(answer == 3)
					{
						//go to menu
					}
			}
		
		public static void addStudent() throws IOException
		{
			System.out.println("What is the first name of your new student");
			first = stringInput.nextLine();


			System.out.println("Last Name?");
			last = stringInput.nextLine();
			
			
			System.out.println();
			System.out.println("What is " + first + " " + last + "'s first period class? Your options are: ");
			System.out.println("\t1) Biology\n\t2) English\n\t3) Algebra");
			firstP = intInput.nextInt(); 
			
			if(firstP == 1)
				{
					string1P = "Biology";
					
					System.out.println("What is their grade in Biology?");
					System.out.println("\tuse a capitalized letter with a + or - or nothing");
					firstG = stringInput.nextLine();
					
					System.out.println("What about second period class?");
					System.out.println("\t1) English\n\t2) Algebra");
					secondP = intInput.nextInt();
					if(secondP == 1)
						{
							string2P = "English";
							
							System.out.println("What is their grade in English?");
							System.out.println("\tuse a capitalized letter with a + or - or nothing");
							secondG = stringInput.nextLine();
							
							string3P = "Algebra";
							
							System.out.println("What is their grade in Algebra?");
							System.out.println("\tuse a capitalized letter with a + or - or nothing");
							thirdG = stringInput.nextLine();
							//display all classes
						}
					else if(secondP == 2)
						{
							string2P = "Algebra";
							
							System.out.println("What is their grade in Algebra?");
							System.out.println("\tuse a capitalized letter with a + or - or nothing");
							secondG = stringInput.nextLine();
							
							string3P = "English";
							
							System.out.println("What is their grade in English?");
							System.out.println("\tuse a capitalized letter with a + or - or nothing");
							thirdG = stringInput.nextLine();
							//display all classes
						}
					
					
				}

			else if(firstP == 2)
				{
					string1P = "English";
					System.out.println("What is their grade in English?");
					System.out.println("\tuse a capitalized letter with a + or - or nothing");
					firstG = stringInput.nextLine();
					
					System.out.println("What about second period?");
					System.out.println("\t1) Biology\n\t2) Algebra");
					secondP = intInput.nextInt();
					if(secondP == 1)
						{
							string2P = "Biology";
							System.out.println("What is their grade in Biology?");
							System.out.println("\tuse a capitalized letter with a + or - or nothing");
							secondG = stringInput.nextLine();
							
							string3P = "Algebra";
							System.out.println("What is their grade in Algebra?");
							System.out.println("\tuse a capitalized letter with a + or - or nothing");
							thirdG = stringInput.nextLine();
						}
					else if(secondP == 2)
						{
						string2P = "Algebra";
						System.out.println("What is their grade in Algebra?");
						System.out.println("\tuse a capitalized letter with a + or - or nothing");
						secondG = stringInput.nextLine();
						
						string3P = "Biology";
						System.out.println("What is their grade in Biology?");
						System.out.println("\tuse a capitalized letter with a + or - or nothing");
						thirdG = stringInput.nextLine();
						}
				}
			
			else if(firstP == 3)
				{
				string1P = "Algebra";
				System.out.println("What is their grade in Algebra?");
				System.out.println("\tuse a capitalized letter with a + or - or nothing");
				firstG = stringInput.nextLine();
				
				System.out.println("What about second period?");
				System.out.println("\t1) Biology\n\t2) English");
				secondP = intInput.nextInt();
				if(secondP == 1)
					{
						string2P = "Biology";
						System.out.println("What is their grade in Biology?");
						System.out.println("\tuse a capitalized letter with a + or - or nothing");
						secondG = stringInput.nextLine();
						
						string3P = "English";
						System.out.println("What is their grade in English?");
						System.out.println("\tuse a capitalized letter with a + or - or nothing");
						thirdG = stringInput.nextLine();
					}
				else if(secondP == 2)
					{
					string2P = "English";
					System.out.println("What is their grade in English?");
					System.out.println("\tuse a capitalized letter with a + or - or nothing");
					secondG = stringInput.nextLine();
					
					string3P = "Biology";
					System.out.println("What is their grade in Biology?");
					System.out.println("\tuse a capitalized letter with a + or - or nothing");
					thirdG = stringInput.nextLine();
					}
				}
			else
				{
					System.out.println("You did not enter a valid answer, you will restart.");
				}
			RunSIS.StudentList.add(new Student(first, last, string1P, firstG, string2P, secondG, string3P, thirdG));
			
			System.out.println("Your new roster is: ");
			for(int i = 0; i < RunSIS.StudentList.size(); i++)
			{
				System.out.println();
				System.out.print(i + 1 + ") ");
				System.out.print(RunSIS.StudentList.get(i).getFirstName() + " " + RunSIS.StudentList.get(i).getLastName() + " " + 
				RunSIS.StudentList.get(i).getFirstPeriod() + " " + RunSIS.StudentList.get(i).getFirstGrade() + " " + 
				RunSIS.StudentList.get(i).getSecondPeriod() + " " + RunSIS.StudentList.get(i).getSecondGrade() + " " + 
				RunSIS.StudentList.get(i).getThirdPeriod() + " " + RunSIS.StudentList.get(i).getThirdGrade());
			}
		}
		
		public static void deleteStudent() throws IOException
		{
			RunSIS.fillArrayList();
			for(int i = 0; i < RunSIS.StudentList.size(); i++)
				{
					System.out.println();
					System.out.print(i + 1 + ") ");
					System.out.print(RunSIS.StudentList.get(i).getFirstName() + " " + RunSIS.StudentList.get(i).getLastName() + " " + 
					RunSIS.StudentList.get(i).getFirstPeriod() + " " + RunSIS.StudentList.get(i).getFirstGrade() + " " + 
					RunSIS.StudentList.get(i).getSecondPeriod() + " " + RunSIS.StudentList.get(i).getSecondGrade() + " " + 
					RunSIS.StudentList.get(i).getThirdPeriod() + " " + RunSIS.StudentList.get(i).getThirdGrade());
				}
			
			System.out.println("\n\n");
			System.out.println("What is the last name of the student you would like to delete?");
			deleteLast = stringInput.nextLine();
			
			for(int i = 0; i < RunSIS.StudentList.size(); i++)

				{
					if(deleteLast.equals(RunSIS.StudentList.get(i).getLastName()))
						{
							RunSIS.StudentList.remove(i);
						}
				}
			
			//display new roster
			for(int i = 0; i < RunSIS.StudentList.size(); i++)
				{
					System.out.println();
					System.out.print(i + 1 + ") ");
					System.out.print(RunSIS.StudentList.get(i).getFirstName() + " " + RunSIS.StudentList.get(i).getLastName() + " " + 
					RunSIS.StudentList.get(i).getFirstPeriod() + " " + RunSIS.StudentList.get(i).getFirstGrade() + " " + 
					RunSIS.StudentList.get(i).getSecondPeriod() + " " + RunSIS.StudentList.get(i).getSecondGrade() + " " + 
					RunSIS.StudentList.get(i).getThirdPeriod() + " " + RunSIS.StudentList.get(i).getThirdGrade());
				}

			System.out.println("\n");
			System.out.println("This is your new roster ^^");
		}
	
		
		
		
	}