//#2
import java.util.Comparator;

public class PeriodSorter implements Comparator<Student>
	{
		static int classSortChoice;
		
		public int compare (Student s1, Student s2)
		{
			if(classSortChoice == 1)
				return s1.getFirstPeriod().compareTo(s2.getFirstPeriod());
			else if(classSortChoice == 2)
				return s1.getSecondPeriod().compareTo(s2.getSecondPeriod());
			else 
				return s1.getThirdPeriod().compareTo(s2.getThirdPeriod());
		}
	}
