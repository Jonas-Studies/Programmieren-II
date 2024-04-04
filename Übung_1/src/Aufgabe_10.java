
public class Aufgabe_10 {
	
	public static void main (String [] args) {
		for (int number = 0; number < 10; number += 1) {
			int fibonacci_number = get_fibonacci_number_iterative(number);
			
			System.out.println("The fibonacci number of " + number + " is " + fibonacci_number);
			
		}
		
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
		
		int array [] = new int [n * 2];
		
		if (n == 0 || n == 1) {
			result = n;
		}
		else {
			array[0] = n;
			
			for (int position = 0; position < n * 2; position += 1) {
				if (array[position] == 1) {
					result += array[position];
					array[position] = 0;
				
					continue;
				}
				
				if (array[position] != 0) {				
					array[position] -= 1;
					
					for (int positionII = 0; positionII < n * 2; positionII += 1) {
						if (array[positionII] == 0) {
							array[positionII] = array[position] - 1;
							break;
						}
						
					}
					
					position = -1;
				}
			}
			
		}

		return result;
	}

}