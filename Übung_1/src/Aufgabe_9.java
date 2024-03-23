
public class Aufgabe_9 {
	
	public static void main (String [] args) {
		int n = 123;
		
		long queersumme = get_queersumme(n);
		
		System.out.println("Die Queersumme von " + n + " ist " + queersumme);
		
		return;
	}
	
	public static long get_queersumme (int n) {
		long result = 0l;
		
		if (n < 10) {
			result = n;
		}
		else {
			for (int current_number = n; current_number > 0; current_number = current_number / 10) {
				result += current_number % 10;
			}
		}
		
		return result;
	}

}
