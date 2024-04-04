
public class Aufgabe_1 {
	public static void main (String [] args) {
		Bereichsumsatz umsaetze [] = getBereichsumsaetze();
		
		for (Integer umsatzNr = 0; umsatzNr < umsaetze.length; umsatzNr += 1) {
			System.out.println(umsaetze[umsatzNr]);
		}
		
		return;
	}
	
	public static Bereichsumsatz [] getBereichsumsaetze () {
		Bereichsumsatz result [] = new Bereichsumsatz [10];

		result[0] = new Bereichsumsatz("Bremen", 5000.0);
		result[1] = new Bereichsumsatz("Dresden", 9000.0);
		result[2] = new Bereichsumsatz("Frankfurt", 12000.0);
		result[3] = new Bereichsumsatz("Hamburg", 1000.0);
		result[4] = new Bereichsumsatz("Hannover", 8000.0);
		result[5] = new Bereichsumsatz("Köln", 3000.0);
		result[6] = new Bereichsumsatz("Leipzig", 3000.0);
		result[7] = new Bereichsumsatz("München", 4000.0);
		result[8] = new Bereichsumsatz("Potsdam", 5000.0);
		result[9] = new Bereichsumsatz("Stuttgart", 8000.0);
		
		return result;
	}

}
