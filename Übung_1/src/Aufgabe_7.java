
public class Aufgabe_7 {
	
	public static void main(String[] args) {
		int n1 = 19;
		int n2 = 21;
		
		int ggt = ggt(n1, n2);
		
		System.out.println("Größter gemeinsamer Teiler von " + n1 + " und " + n2 + " ist " + ggt);
		
	}
	
	private static int ggt(int n1, int n2) {
		int result = 0;
		
		if (n1 == n2) {
			result = n1;

		}
		else {
			int larger_number = 0;
			int smaller_number = 0;
			
			if (n1 > n2) {
				larger_number = n1;
				smaller_number = n2;
			}
			else {
				larger_number = n2;
				smaller_number = n1;
			}
			
			for (int current_number = smaller_number; current_number > 0; current_number -= 1) {
				if (smaller_number % current_number == 0 && larger_number % current_number == 0) {
					result = current_number;
					
					break;
				}
			}
		}
		
		return result;
	}

}
