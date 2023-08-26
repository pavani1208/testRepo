package basic1;

import java.util.HashMap;

public class HashMapInternal {
public static void main(String[] args) {

       HashMap<EmployeeO, String> employees = new HashMap<>();
       employees.put(new EmployeeO("John", 30, 50000), "hello");
       employees.put(new EmployeeO("John", 30, 50000), "world");

       System.out.println(employees.get("hello"));
       
       EmployeeO john = new EmployeeO("John", 30, 50000);
       String greeting = employees.get(john);
       System.out.println(greeting);
}
}
