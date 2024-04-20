
public class Aufgabe_6 {
	
	public static void main (String [] args) {
		Personalverwaltung personalverwaltung = new Personalverwaltung();
		
		Mitarbeiter mitarbeiter01 = new Mitarbeiter("Heinrich");
		Mitarbeiter mitarbeiter02 = new Mitarbeiter("Friedrich");
		Mitarbeiter mitarbeiter03 = new Mitarbeiter("Gandalf");
		
		personalverwaltung.addAbrechnung(new Lohnabrechnung(1, mitarbeiter01, 10, 158));
		personalverwaltung.addAbrechnung(new Gehaltsabrechnung(1, mitarbeiter02, 3010));
		personalverwaltung.addAbrechnung(new Gehaltsabrechnung(1, mitarbeiter03, 2700));

		personalverwaltung.addAbrechnung(new Lohnabrechnung(2, mitarbeiter01, 16, 158));
		personalverwaltung.addAbrechnung(new Gehaltsabrechnung(2, mitarbeiter02, 3010));
		personalverwaltung.addAbrechnung(new Gehaltsabrechnung(2, mitarbeiter03, 2800));
		
		personalverwaltung.listAbrechnungenByPeriode(2);
		
		return;
	}

}
