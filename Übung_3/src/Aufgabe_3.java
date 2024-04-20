
public class Aufgabe_3 {
	
	public static void main (String [] args) {
		Personalverwaltung personal = new Personalverwaltung();
		
		Mitarbeiter mitarbeiter01 = new Mitarbeiter("Heinrich");
		Mitarbeiter mitarbeiter02 = new Mitarbeiter("Siegfried");
		Mitarbeiter mitarbeiter03 = new Mitarbeiter("Friedrich");
		
		personal.addMitarbeiter(mitarbeiter01);
		personal.addMitarbeiter(mitarbeiter02);
		personal.addMitarbeiter(mitarbeiter03);
		
		personal.listMitarbeiter();
		
		return;
	}
}