
public class Aufgabe_2 {
	public static void main (String [] args) {
		Bereichsumsatz [] umsaetze = Aufgabe_1.getBereichsumsaetze();
		
		PrintBereichsumsaetze(umsaetze);
		
		return;
	}
	
	public static void PrintBereichsumsaetze (Bereichsumsatz [] umsaetze) {
		for (Integer umsatzNr = 0; umsatzNr < umsaetze.length; umsatzNr += 1) {
			System.out.println(umsaetze[umsatzNr]);
		}
		
		return;
	}

}
