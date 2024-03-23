
public class Aufgabe_10 {
	
	public static void main (String [] args) {
		int number = 7;
		
		int fibonacci_number = get_fibonacci_number_recursive(number);
		
		System.out.println("The fibonacci number of " + number + " is " + fibonacci_number);
		
		return;
	}
	
	public static int get_fibonacci_number_recursive (int n) {
		int result = 0;
		
		if (n == 0 || n == 1) {
			result = n;
		}
		else {
			result = get_fibonacci_number_recursive(n - 1) + get_fibonacci_number_recursive(n - 2);
		}
		
		return result;
	}
	
	public static int get_fibonacci_number_iterative (int n) {
		int result = 0;
		
		// Muss noch implementiert werden
		
		return result;
	}

}