package basic1;

public class EmployeeO {

    private String name;
    private int age;
    private double salary;

    public EmployeeO(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	boolean  a,isB;
	
	

	public boolean isA() {
		return a;
	}

	public void setA(boolean a) {
		this.a = a;
	}

	public boolean isB() {
		return isB;
	}

	public void setB(boolean isB) {
		this.isB = isB;
	}

	@Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
	
	   @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((name == null) ? 0 : name.hashCode());
	        result = prime * result + age;
	        long temp;
	        temp = Double.doubleToLongBits(salary);
	        result = prime * result + (int) (temp ^ (temp >>> 32));
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        EmployeeO other = (EmployeeO) obj;
	        if (age != other.age)
	            return false;
	        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
	            return false;
	        if (name == null) {
	            if (other.name != null)
	                return false;
	        } else if (!name.equals(other.name))
	            return false;
	        return true;
	    }

}
