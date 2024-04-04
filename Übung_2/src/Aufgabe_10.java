
public class Aufgabe_10 {
	public static void main (String [] args) {
		Bereichsumsatz [] umsaetze = Aufgabe_1.getBereichsumsaetze();
		
		set3Tops(umsaetze);
		
		return;
	}
	
	public static Integer set3Tops (Bereichsumsatz [] Umsaetze) {
		Integer result = 0;
		
		for (Integer BereichsNr = 0; BereichsNr < 3 && BereichsNr <= Umsaetze.length; BereichsNr += 1) {
			Integer IndexOfHighestUmsatz = Aufgabe_9.getIndexOfMaxUmsatz(Umsaetze, BereichsNr, Umsaetze.length);
			
			Aufgabe_5.switchBereichsumsaetze(Umsaetze, IndexOfHighestUmsatz, BereichsNr);
			
			result += 1;
		}
		
		for (Integer BereichsNr = 3; BereichsNr < Umsaetze.length; BereichsNr += 1) {
			if (Umsaetze[BereichsNr].getUmsatz() >= Umsaetze[2].getUmsatz()) {
				Aufgabe_5.switchBereichsumsaetze(Umsaetze, result, BereichsNr);
				
				result += 1;
				
			}
		}
		
		return result;
	}

}
