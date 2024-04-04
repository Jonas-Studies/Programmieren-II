
public class Aufgabe_8 {
	
	public static void main (String [] args) {
		Bereichsumsatz [] umsaetze = Aufgabe_1.getBereichsumsaetze();
		
		Aufgabe_7.setFlop(umsaetze);
		
		System.out.println("Letzter: " + umsaetze[umsaetze.length - 1]);
		
		return;
		
	}

}
