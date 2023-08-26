package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Immutable  {

	private String city;
	private final int id;
	private Employee emp;
	private List<String> technologies;

	public Immutable(String name, int age, Employee emp, List<String> technologies) {
		this.city = name;
		this.id = age;
		this.emp = emp; // new Employee(emp.getName(), emp.getAge());
		this.technologies = technologies; //new ArrayList<>(technologies);
	}

	public String getName() {

		return city;
	}

	public int getAge() {
		return id;

	}

	public Employee getEmp() throws CloneNotSupportedException {
		return (Employee) emp.clone(); // new Employee();
	}

	public List<String> getTechnologies() {

		return Collections.unmodifiableList(technologies);

	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp = new Employee();
		emp.setName("divya");
		emp.setAge(23);

		List<String> tec = new ArrayList<String>();
		tec.add("java");
		tec.add("python");

		Immutable im = new Immutable("pdtr", 1, emp, tec);

		System.out.println("id: " + im.getAge());
		System.out.println("name: " + im.getEmp().getName());
		System.out.println("age: " + im.getEmp().getAge());
		System.out.println("city name: " + im.getName());
		for(String tech: im.getTechnologies()) {
			System.out.println(tech);
		}

		System.out.println("--------------------------------------------");

		im.getEmp().setAge(25);
		im.getEmp().setName("Pavani");
		
		//im.getTechnologies().add("soroco");

		System.out.println("id: " + im.getAge());
		System.out.println("name: " + im.getEmp().getName());
		System.out.println("age: " + im.getEmp().getAge());
		System.out.println("city name: " + im.getName());
		for(String tech: im.getTechnologies()) {
			System.out.println(tech);
		}
	}
}
