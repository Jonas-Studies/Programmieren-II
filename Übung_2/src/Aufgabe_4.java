
public class Aufgabe_4 {
	
	public static void main (String [] args) {
		Bereichsumsatz [] umsaetze = Aufgabe_1.getBereichsumsaetze();
		
		Double AverageBereichsumsatz = Aufgabe_3.GetAverageBereichsumsatz(umsaetze);
		
		System.out.println("Durchschnittlicher Bereichsumsatz: " + AverageBereichsumsatz);
		
		return;
	}

}
