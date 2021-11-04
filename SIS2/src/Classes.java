//#2
import java.util.*;
public class Classes
	{
		private static Scanner stringGetter = new Scanner(System.in);
		private static int studentIndex = Grades.studentIndexGetter();
		public static void classChanger() {
			System.out.println("Their classes are:");
			System.out.println("P1 "+RunSIS.StudentList.get(studentIndex).getFirstPeriod());
			System.out.println("P2 "+RunSIS.StudentList.get(studentIndex).getFirstPeriod());
			System.out.println("P3 "+RunSIS.StudentList.get(studentIndex).getFirstPeriod());
			System.out.println("\nDo you want to change them?\nyes or no");
			if(stringGetter.nextLine().equalsIgnoreCase("yes")) {
				System.out.println("What do you want to be their new first period class?");
				if(stringGetter.nextLine().equalsIgnoreCase("Algebra")) {
					RunSIS.StudentList.get(studentIndex).setFirstPeriod("Algebra");
				}
			}
		}
	}