import java.util.Scanner;

public class Aufgabe_5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eingeben einer Zahl: ");
		int first_number = sc.nextInt();

		System.out.println("Eingeben einer Zahl: ");
		int second_number = sc.nextInt();
		
		sc.close();

		int smaller_number = 0;
		int bigger_number = 0;
		
		if (first_number < second_number) {
			smaller_number = first_number;
			bigger_number = second_number;
		}
		else {
			smaller_number = second_number;
			bigger_number = first_number;
		}
		
		int sum = 0;
		
		for (int current_number = smaller_number; current_number <= bigger_number; current_number += 1) {
			sum += current_number;
		}
		
		System.out.println("Ergebnis der Summenfunktion der Zahlen von " + Integer.toString(smaller_number) + " bis " + Integer.toString(bigger_number) + " ist " + Integer.toString(sum));
		
		return;
	}

}