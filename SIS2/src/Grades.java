//#2
import java.util.*;

public class Grades
	{
		private static String lFName;
		private static String sFName;
		private static String forlFName;
		private static String forlLName;
		private static int sIndex;
		private static Scanner stringGetter = new Scanner(System.in);
		private static Scanner intGetter = new Scanner(System.in);
		private static String className;
		private static String newGrade;
		private static int classSizeChoice;
		private static int classOneChoice;
		private static int classTwoChoice;
		private static String tempClassStorage;
		private static int optionChoice;
		private static String classChoice;

		public static void gradesMenu()
			{
				System.out.println("Would you like to \n1)change a student's schedule\n2)change a student's grades");
				optionChoice = intGetter.nextInt();
				if (optionChoice == 1)
					{
						changeClasses();
					} else
					{
						changeGrade();
					}
			}

		private static void printStudentList()
			{
				for (int i = 0; i < RunSIS.StudentList.size(); i++)
					{
						System.out.println(RunSIS.StudentList.get(i).getLastName() + ", "
								+ RunSIS.StudentList.get(i).getFirstName());
					}
			}

		public static int studentIndexGetter()
			{
				printStudentList();
				System.out.println("What is the first name of the student who you want to select?");
				sFName = stringGetter.nextLine();
				System.out.println("What is the last name of the student who you want to select?");
				lFName = stringGetter.nextLine();
				for (int i = 0; i < RunSIS.StudentList.size(); i++)
					{
						forlFName = RunSIS.StudentList.get(i).getFirstName();
						forlLName = RunSIS.StudentList.get(i).getLastName();
						if (forlFName.equals(sFName) && forlLName.equals(lFName))
							{
								return i;
							}
					}
				return 0;
			}

		public static void changeClasses()
			{
				sIndex = studentIndexGetter();
				System.out.println("Do you want so switch (2) two classes or (3) change all three?");
				classSizeChoice = intGetter.nextInt();
				if (classSizeChoice == 2)
					{
						changeTwoClasses(sIndex);
					} else
					{
						System.out.println("What do you want the first period class to be?");
						classSelections(1);
						classSetter(1, classChoice, sIndex);
					}
			}

		private static void classSelections(int s)
			{
				boolean oneNotUsed = true;
				boolean twoNotUsed = true;
				boolean threeNotUsed = true;
				if (s == 1)
					{
						for (int i = 0; i < 3; i++)
							{
								if (oneNotUsed && i == 1)
									{

										System.out.print(i + ") Algebra");
										classChoice = "Algebra";
									} else if (twoNotUsed && i == 2)
									{

										System.out.print(i + ") English");
										classChoice = "English";
									} else if (threeNotUsed && i == 3)
									{

										System.out.print(i + ") Biology");
										classChoice = "Biology";
									}
								if (i == 0 || i == 1)
									{
										System.out.println(" or ");
									}
							}
					}else /*if (s==2)*/ {
						int i = 0;
								if (oneNotUsed && i == 1)
									{
										System.out.print(i + ") Algebra");
										classChoice = "Algebra";
										i++;
									}  if (twoNotUsed && i == 2)
									{
										System.out.print(i + ") English");
										classChoice = "English";
										i++;
									}  if (threeNotUsed && i == 3)
									{
										System.out.print(i + ") Biology");
										classChoice = "Biology";
										i++;
									}
								if (i == 0 || i == 1)
									{
										System.out.println(" or ");
									}
						
					}
			}

		private static void changeTwoClasses(int sI)
			{
				System.out.println(
						RunSIS.StudentList.get(sI).getFirstName() + "'s first period class is " + classGetter(1, sI));
				System.out.println(
						RunSIS.StudentList.get(sI).getFirstName() + "'s second period class is " + classGetter(2, sI));
				System.out.println(
						RunSIS.StudentList.get(sI).getFirstName() + "'s third period class is " + classGetter(3, sI));

				System.out.println("What period is the first class that you want to switch?");
				classOneChoice = intGetter.nextInt();
				System.out.println("Which is the second class that you want to switch?");
				classTwoChoice = intGetter.nextInt();
				tempClassStorage = classGetter(classOneChoice, sI);
				classSetter(classOneChoice, classGetter(classTwoChoice, sI), sI);
				classSetter(classTwoChoice, tempClassStorage, sI);

			}

		private static String classGetter(int period, int studentIndex)
			{
				if (period == 1)
					{
						return RunSIS.StudentList.get(studentIndex).getFirstPeriod();
					} else if (period == 2)
					{
						return RunSIS.StudentList.get(studentIndex).getSecondPeriod();
					} else
					{
						return RunSIS.StudentList.get(studentIndex).getThirdPeriod();
					}

			}

		private static void classSetter(int p, String cS, int studentIndex)
			{
				if (p == 1)
					{
						RunSIS.StudentList.get(studentIndex).setFirstPeriod(cS);
					} else if (p == 2)
					{
						RunSIS.StudentList.get(studentIndex).setSecondPeriod(cS);
					} else
					{
						RunSIS.StudentList.get(studentIndex).setThirdPeriod(cS);
					}
			}

		public static void changeGrade()
			{
				sIndex = studentIndexGetter();
				System.out.println(classGetter(2, sIndex) + " " + RunSIS.StudentList.get(sIndex).getSecondGrade());
				System.out.println(classGetter(3, sIndex) + " " + RunSIS.StudentList.get(sIndex).getThirdGrade());
				System.out.println(classGetter(1, sIndex) + " " + RunSIS.StudentList.get(sIndex).getFirstGrade()
						+ "\nWhich grade do you want to change?\nPlease enter the name of the class (case insensitive)\n");

				className = stringGetter.nextLine();
				System.out.println("What do you want the grade to be?");
				newGrade = stringGetter.nextLine();
				if (className.equalsIgnoreCase(classGetter(2, sIndex)))
					{
						RunSIS.StudentList.get(sIndex).setSecondGrade(newGrade);
						System.out.println(RunSIS.StudentList.get(sIndex).getFirstName() + " now has a "
								+ RunSIS.StudentList.get(sIndex).getSecondGrade() + " in " + classGetter(2, sIndex));
					} else if (className.equalsIgnoreCase(classGetter(1, sIndex)))
					{
						RunSIS.StudentList.get(sIndex).setFirstGrade(newGrade);
						System.out.println(RunSIS.StudentList.get(sIndex).getFirstName() + " now has a "
								+ RunSIS.StudentList.get(sIndex).getFirstGrade() + " in " + classGetter(1, sIndex));
					} else if (className.equalsIgnoreCase(classGetter(3, sIndex)))
					{
						RunSIS.StudentList.get(sIndex).setThirdGrade(newGrade);
						System.out.println(RunSIS.StudentList.get(sIndex).getFirstName() + " now has a "
								+ RunSIS.StudentList.get(sIndex).getThirdGrade() + " in " + classGetter(3, sIndex));
					}
				// It needs an update GPA method to be called here
			}
	}