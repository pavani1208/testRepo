package basic;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DayOfWeekSorter {
public static void main(String[] args) {
	List<DayOfWeek> d = new ArrayList<DayOfWeek>();
	d.add(DayOfWeek.FRIDAY);
	d.add(DayOfWeek.MONDAY);
	d.add(DayOfWeek.SATURDAY);
	d.add(DayOfWeek.THURSDAY);
	System.out.println(d);
	
	List<DayOfWeek> sorD = d.stream().sorted().toList();
	System.out.println(sorD);
}
}
