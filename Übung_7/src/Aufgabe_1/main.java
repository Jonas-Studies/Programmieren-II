package Aufgabe_1;

public class main {

	public static void main(String[] args) {
		Mitarbeiter mitarbeiter01 = new Mitarbeiter("Hans");
		Mitarbeiter mitarbeiter02 = new Mitarbeiter("Franz");
		
		Mitarbeiterliste mitarbeiterListe = new Mitarbeiterliste(1);
		
		mitarbeiterListe.addMitarbeiter(mitarbeiter01);
		mitarbeiterListe.addMitarbeiter(mitarbeiter02);
		
	}

}
