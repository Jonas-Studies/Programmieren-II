
public class Aufgabe_8 {
	
	public static void main(String [] args) {
		int n1 = 2;
		int n2 = 3;
		
		long kgv = get_kgv(n1, n2);
		
		System.out.println("Das kleinste gemeinsame Vielfache von " + n1 + " und " + n2 + " ist " + kgv);
		
		return;
	}
	
	public static long get_kgv(int n1, int n2) {
		long result = 0l;
		
		if (n1 == n2) {
			result = n1;
		}
		else {
			int smaller_number = 0;
			int larger_number = 0;
			
			if (n1 > n2) {
				larger_number = n1;
				smaller_number = n2;
			}
			else {
				larger_number = n2;
				smaller_number = n1;
			}
			
			for (int multiplier = 1; result == 0 ; multiplier += 1) {
				if ((smaller_number * multiplier) % larger_number == 0) {
					result = smaller_number * multiplier;
				}
				
				if ((larger_number * multiplier) % smaller_number == 0) {
					result = larger_number * multiplier;
				}
			}
		}
		
		return result;
	}

}
