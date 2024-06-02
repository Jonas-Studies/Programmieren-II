package Aufgabe_1;

public class Personalverwaltung {
	private Mitarbeiterliste mitarbeiterliste = new Mitarbeiterliste(10);
	private Abrechnungsliste abrechnungsliste = new Abrechnungsliste(10);
	
	public void addMitarbeiter (Mitarbeiter mitarbeiterToAdd) {
		this.mitarbeiterliste.addMitarbeiter(mitarbeiterToAdd);
	}
	
	public void removeMitarbeiter (Mitarbeiter mitarbeiterToRemove) {
		this.mitarbeiterliste.removeMitarbeiter(mitarbeiterToRemove);
	}
	
	public void addAbrechnung (Abrechnung abrechnungToAdd) {
		this.abrechnungsliste.addAbrechnung(abrechnungToAdd);
	}

	public void listMitarbeiter () {
		System.out.println("Mitarbeiter:");
		
		for (int mitarbeiterNr = 0; mitarbeiterNr < this.mitarbeiterliste.getNumberOfUsedElements(); mitarbeiterNr += 1) {
			System.out.println(" - " + this.mitarbeiterliste.getMitarbeiterByPosition(mitarbeiterNr));
		}
	}
	
	public void sortMitarbeiter () {
		for (int numberOfLastSortedMitarbeiter = this.mitarbeiterliste.getNumberOfUsedElements() - 1; numberOfLastSortedMitarbeiter > 0; numberOfLastSortedMitarbeiter -= 1) {
			for (int mitarbeiterNr = 0; mitarbeiterNr < numberOfLastSortedMitarbeiter; mitarbeiterNr += 1) {
				Mitarbeiter currentMitarbeiter = this.mitarbeiterliste.getMitarbeiterByPosition(mitarbeiterNr);
				Mitarbeiter nextMitarbeiter = this.mitarbeiterliste.getMitarbeiterByPosition(mitarbeiterNr + 1);
				
				if (currentMitarbeiter.istKleiner(nextMitarbeiter) == false) {
					this.mitarbeiterliste.swapMitarbeiterByPosition(mitarbeiterNr, mitarbeiterNr + 1);
				}
			}
		}
		
		return;
	}
	
	public void listAbrechnungenByPeriode (Integer periode) {
		Integer currentNumberOfAbrechnungen = this.abrechnungsliste.getNumberOfAbrechnungen();
		
		System.out.println("Abrechnungen:");
		
		for (Integer currentPosition = 0; currentPosition < currentNumberOfAbrechnungen; currentPosition += 1) {
			Abrechnung currentAbrechnung = this.abrechnungsliste.getAbrechnungByPosition(currentPosition);
			
			if (currentAbrechnung.getPeriode() == periode) {
				System.out.println(" - " + this.abrechnungsliste.getAbrechnungByPosition(currentPosition));
			}
		}
		
		return;
	}
}
