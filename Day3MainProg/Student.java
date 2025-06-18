package Day3MainProg;
	import java.util.Scanner;

	class Student {
	    private String name;
	    private int rollNumber;
	    private int[] marks = new int[3];  
	    public Student(String name, int rollNumber) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	    }

	 
	    public void assignMarks(int[] marks) {
	        if (marks.length == 3) {
	            this.marks = marks;
	        } else {
	            System.out.println("Please enter marks for exactly 3 subjects.");
	        }
	    }

	    public int getTotalMarks() {
	        int total = 0;
	        for (int mark : marks) {
	            total += mark;
	        }
	        return total;
	    }

	    public double getAverageMarks() {
	        return getTotalMarks() / 3.0;
	    }

	    public void displayResult() {
	        System.out.println("\n--- Student Result ---");
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Marks: ");
	        for (int i = 0; i < marks.length; i++) {
	            System.out.println("  Subject " + (i + 1) + ": " + marks[i]);
	        }
	        System.out.println("Total Marks: " + getTotalMarks());
	        System.out.println("Average Marks: " + getAverageMarks());
	    }
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);	       
	        System.out.print("Enter student name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter roll number: ");
	        int rollNumber = scanner.nextInt();

	        Student student = new Student(name, rollNumber);   
	        int[] marks = new int[3];
	        System.out.println("Enter marks for 3 subjects:");
	        for (int i = 0; i < 3; i++) {
	            System.out.print("Subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	        }

	        student.assignMarks(marks);	       
	        student.displayResult();
	        scanner.close();
	    }
	}

