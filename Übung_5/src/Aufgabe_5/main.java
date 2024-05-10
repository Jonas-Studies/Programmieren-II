package Aufgabe_5;

public class main {
	public static void main (String [] args) {
		Kunde testKunden [] = new Kunde [2];
		
		testKunden[0] = new Kunde("Gandalf", "Franz");
		testKunden[1] = new Kunde("Sauron", "Hans");
		
		new KundenAuswahlFrame(testKunden);
	}
}
