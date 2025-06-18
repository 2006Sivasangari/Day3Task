package Day3Task;

public class MethodOverloading {
	
	    public int sum(int a, int b) {
	        return a + b;
	    }

	    public double sum(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        MethodOverloading calculator = new MethodOverloading();

	        int intResult = calculator.sum(5, 10);
	        double doubleResult = calculator.sum(5.5, 3.2);

	        System.out.println("Sum of integers: " + intResult);
	        System.out.println("Sum of doubles: " + doubleResult);
	    }
	}

