
public class Aufgabe_9 {
	
	public static Integer getIndexOfMaxUmsatz (Bereichsumsatz [] umsaetze, Integer von, Integer bis) {
		Integer result = von;
		
		Double highestUmsatz = umsaetze[von].getUmsatz();
		
		if (von >= 0 && bis <= umsaetze.length) {
			for (Integer bereichsumsatzNr = von; bereichsumsatzNr < bis; bereichsumsatzNr += 1) {
				if (umsaetze[bereichsumsatzNr].getUmsatz() > highestUmsatz) {
					highestUmsatz = umsaetze[bereichsumsatzNr].getUmsatz();
					
					result = bereichsumsatzNr;
			
				}
				
			}
			
		}
		
		return result;
	}

}
