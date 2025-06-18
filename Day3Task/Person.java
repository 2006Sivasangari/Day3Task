package Day3Task;

public class Person {
	
	    protected String name;
	    protected int age;
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	class Employee extends Person {
	    private String jobTitle;
	    private double basicSalary;
	    private double bonus;

	    public Employee(String name, int age, String jobTitle, double basicSalary, double bonus) {
	        super(name, age);
	        this.jobTitle = jobTitle;
	        this.basicSalary = basicSalary;
	        this.bonus = bonus;
	    }

	    public double calculateTotalSalary() {
	        return basicSalary + bonus;
	    }

	    public void displayEmployeeInfo() {
	        super.displayInfo();
	        System.out.println("Job Title: " + jobTitle);
	        System.out.println("Basic Salary: $" + basicSalary);
	        System.out.println("Bonus: $" + bonus);
	        System.out.println("Total Salary: $" + calculateTotalSalary());
	    }
	
	    public static void main(String[] args) {
	        Employee emp = new Employee("Alice Johnson", 30, "Software Engineer", 60000, 5000);
	        emp.displayEmployeeInfo();
	    }
	}

