
public class Aufgabe_5 {
	public static void main (String [] args) {
		Bereichsumsatz umsaetze [] = Aufgabe_1.getBereichsumsaetze();
		
		Aufgabe_2.PrintBereichsumsaetze(umsaetze);
		
		switchBereichsumsaetze(umsaetze, 0, 3);
		
		Aufgabe_2.PrintBereichsumsaetze(umsaetze);
		
		return;
	}
	
	public static void switchBereichsumsaetze (Bereichsumsatz [] umsaetze, Integer position01, Integer position02) {
		if (position01 >= 0 && position02 >= 0) {
			if (position01 <= umsaetze.length && position02 <= umsaetze.length) {
				Bereichsumsatz bereichsumsatzPosition01 = umsaetze[position01];
				
				umsaetze[position01] = umsaetze[position02];
				umsaetze[position02] = bereichsumsatzPosition01;
			}
		}
		
		return;
	}

}
