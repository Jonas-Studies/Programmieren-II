
public class Aufgabe_2 {
	
	public static void main (String [] args) {
		Mitarbeiterliste mitarbeiter = new Mitarbeiterliste(10);
		
		Mitarbeiter mitarbeiter01 = new Mitarbeiter("Heinrich");
		Mitarbeiter mitarbeiter02 = new Mitarbeiter("Friedrich");
		Mitarbeiter mitarbeiter03 = new Mitarbeiter("Gandalf");
		
		mitarbeiter.addMitarbeiter(mitarbeiter01);
		mitarbeiter.addMitarbeiter(mitarbeiter02);
		
		mitarbeiter.setMitarbeiterByPosition(1, mitarbeiter03);
		
		mitarbeiter.removeMitarbeiter(mitarbeiter01);
		
		return;
	}

}
