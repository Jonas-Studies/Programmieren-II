
public class Aufgabe_6 {
	
	public static void main (String [] args) {
		Bereichsumsatz [] umsaetze = Aufgabe_1.getBereichsumsaetze();
		
		Aufgabe_2.PrintBereichsumsaetze(umsaetze);
		
		Integer positionOfLowestBereichsumsatz = getIndexOfMinUmsatz(umsaetze);
		
		// Ausgeben der Position + 1 da für Menschen lesbarer
		System.out.println("Position des kleinsten Umsatezs " + positionOfLowestBereichsumsatz + 1);
		
		return;
	}
	
	public static Integer getIndexOfMinUmsatz (Bereichsumsatz [] umsaetze) {
		Integer result = 0;
		
		Double lowestBereichsumsatz = umsaetze[result].getUmsatz();
		
		// Durchlaufen ab zweitem Element, da erstes Vorausgewählt
		for (Integer bereichsumsatzNr = 1; bereichsumsatzNr < umsaetze.length; bereichsumsatzNr += 1) {
			if (umsaetze[bereichsumsatzNr].getUmsatz() < lowestBereichsumsatz) {
				lowestBereichsumsatz = umsaetze[bereichsumsatzNr].getUmsatz();
				
				result = bereichsumsatzNr;
			}
			
		}
		
		return result;
	}

}
