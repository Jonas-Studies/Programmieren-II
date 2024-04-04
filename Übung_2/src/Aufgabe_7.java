
public class Aufgabe_7 {
	
	public static void setFlop (Bereichsumsatz [] umsaetze) {
		Integer positionOfLowestBereichsumsatz = Aufgabe_6.getIndexOfMinUmsatz(umsaetze);
		
		Bereichsumsatz lowestBereichsumsatz = umsaetze[positionOfLowestBereichsumsatz];
		
		umsaetze[positionOfLowestBereichsumsatz] = umsaetze[umsaetze.length - 1];
		umsaetze[umsaetze.length - 1] = lowestBereichsumsatz;
		
		return;
	}

}
