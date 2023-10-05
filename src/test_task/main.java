package test_task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateSorter dateSorter = new DateSorter();
		List<LocalDate> dates = new ArrayList<LocalDate>();
		dates.add(LocalDate.of(2004, 7, 1));
		dates.add(LocalDate.of(2022, 2, 1));
		dates.add(LocalDate.of(2005, 1, 2));
		dates.add(LocalDate.of(2007, 1, 1));
		dates.add(LocalDate.of(2032, 5, 3));
		Collection<LocalDate> dates2 = dateSorter.sortDates(dates);
		
		for(var date : dates2) {
			System.out.println(date);
		}
	}

}
