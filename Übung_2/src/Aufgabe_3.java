
public class Aufgabe_3 {
	
	public static Double GetAverageBereichsumsatz (Bereichsumsatz [] umsaetze) {
		Double result = 0.0;
		
		Double gesamtumsatz = 0.0;
		Integer numberOfBereichsumsaetze = 0;
		
		for (numberOfBereichsumsaetze = 0; numberOfBereichsumsaetze < umsaetze.length; numberOfBereichsumsaetze += 1) {
			gesamtumsatz += umsaetze[numberOfBereichsumsaetze].getUmsatz();
		}
		
		result = gesamtumsatz / numberOfBereichsumsaetze;
		
		return result;
	}

}
