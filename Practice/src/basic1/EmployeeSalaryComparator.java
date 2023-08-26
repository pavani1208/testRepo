package basic1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSalaryComparator implements Comparator<EmployeeO>{

	@Override
	public int compare(EmployeeO o1, EmployeeO o2) {
		
		int salaryComparision =Double.compare(o1.getSalary(), o2.getSalary());
		if(salaryComparision==0) {
			int ageComparision = Integer.compare(o1.getAge(), o2.getAge());
			if(ageComparision==0) {
				
				return o1.getName().compareTo(o2.getName());
			}
		
			return ageComparision;
		}
		return salaryComparision;
	}

	public static void main(String[] args) {
		
		
		 List<EmployeeO> employees = new ArrayList<>();
	        employees.add(new EmployeeO("John", 30, 3500.0));
	        employees.add(new EmployeeO("Alice", 22, 2500.0));
	        employees.add(new EmployeeO("Bob", 30, 3500.0));
	        
	        for(EmployeeO emp  : employees) {
	        	System.out.println(emp);
	        }
	        
	        System.out.println("------------after sorting----------");
	        
	        Collections.sort(employees, new EmployeeSalaryComparator());
	        
	        for(EmployeeO emp  : employees) {
	        	System.out.println(emp);
	        }
	}
}
