package basic1;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	public class EmployeeSalaryIncreaseExample {

	    public static void main(String[] args) {
	        // Create a list of employee objects
	        List<EmployeeO> employees = new ArrayList<>();
	        employees.add(new EmployeeO("John", 30, 3000.0));
	        employees.add(new EmployeeO("Alice", 22, 2500.0));
	        employees.add(new EmployeeO("Bob", 30, 3500.0));

	        
	        
	        List<EmployeeO> sorted=    employees.stream().sorted((e1, e2)->{
	        	if(e1.getAge()==e2.getAge())
	        		return e1.getName().compareTo(e2.getName());
	        	else if(e1.getAge()>e2.getAge())
	        		return 1;
	        	else
	        		return -1;
	        }).collect(Collectors.toList());
	        
	        sorted.forEach(System.out::println);
	        
	        System.out.println("---------------------------------------");
	        // Increase salary by 20% for employees whose age is greater than 25
	        List<EmployeeO> updatedEmployees = employees.stream()
	                .map(e -> {
	                    if (e.getAge() > 25) {
	                        double increasedSalary = e.getSalary() * 1.2;
	                        e.setSalary(increasedSalary);
	                    }
	                    return e;
	                })
	                .collect(Collectors.toList());

	        // Print the updated salaries
	        updatedEmployees.forEach(e-> System.out.println(e.getName()+" "+ e.getSalary())); 
	        
	        System.out.println("------------------------------------------");
	        
	        // retrun Employee name who's age is grater than 20;
	        
	      List<String> name= employees.stream().filter(e-> e.getAge()>25).map(EmployeeO:: getName).collect(Collectors.toList());
	        name.forEach(System.out::println);
	        
	    }
	}

	


