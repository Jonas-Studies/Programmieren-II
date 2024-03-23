
public class Aufgabe_4 {
	public static void main(String[] args) {
		int lower_end = 0;
		int upper_end = 1000;
		
		
		System.out.println("Primzahlen von " + Integer.toString(lower_end) + " bis " + Integer.toString(upper_end) + " sind: ");
		
		for (int current_number = lower_end; current_number <= upper_end; current_number += 1) {
			
			// Null nicht durch sich selbst teilbar und eins ist laut Wikipedia keine Primzahl
			if (current_number == 0 || current_number == 1) {
				continue;
			}
			
			// Primzahlen sind nur natürliche zahlen
			if (current_number < 0)
			{
				continue;
			}
			
			if (check_integer_is_primzahl(current_number) == true) {
				System.out.println(" - " + Integer.toString(current_number));
				
			}
			
		}
		
	}
	
	private static boolean check_integer_is_primzahl(int number) {
		boolean result = true;
		
		// Schleife startet mit zwei da jede zahl durch eins teilbar ist und somit jede Zahl als falsch erkannt werden würde
		for (int number_for_comparison = 2; number_for_comparison < number; number_for_comparison += 1) {
			if (number % number_for_comparison == 0) {
				result = false;
				
				break;
			}
		}
		
		return result;
	}
	
}
