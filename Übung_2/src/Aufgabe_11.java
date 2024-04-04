
public class Aufgabe_11 {
	
	public static void main (String [] args) {
		Bereichsumsatz umsaetze [] = Aufgabe_1.getBereichsumsaetze();
		
		Integer NumberOfTops = Aufgabe_10.set3Tops(umsaetze);
		
		Integer topNr = 1;
		
		for (Integer bereichsumsatzNr = 0; bereichsumsatzNr < NumberOfTops; bereichsumsatzNr += 1) {
			System.out.println(topNr + ". " + umsaetze[bereichsumsatzNr]);
			
			// Die set3Tops Methode setzt die ersten drei Plätze, dabei kann es mehr als einen Drittplatzierten geben
			if (topNr < 3) {
				topNr += 1;
			}
		
		}
		
		return;
	}

}
