package Aufgabe_1;

public class Abrechnungsliste {
	private Abrechnung abrechnung [];
	
	private Integer numberOfAbrechnungen = 0;
	
	public Integer getNumberOfAbrechnungen () { return this.numberOfAbrechnungen; }
	private void incrementNumberOfAbrechnungen () { this.numberOfAbrechnungen += 1; }
	private void decrementNumberOfAbrechnungen () { this.numberOfAbrechnungen -= 1; }
	
	public Integer getSizeOfAbrechnungsliste () { return this.abrechnung.length; }
	
	public Abrechnungsliste (int sizeOfNewAbrechnungsliste) {
		this.abrechnung = new Abrechnung [sizeOfNewAbrechnungsliste];
	}
	
	public Integer addAbrechnung (Abrechnung newAbrechnung) {
		Integer result = null;
		
		Integer currentNumberOfAbrechnungen = this.getNumberOfAbrechnungen();
		
		if (currentNumberOfAbrechnungen < this.getSizeOfAbrechnungsliste()) {
			this.setAbrechnungByPosition(newAbrechnung, currentNumberOfAbrechnungen);
			
			this.incrementNumberOfAbrechnungen();
			
			result = currentNumberOfAbrechnungen;
		}
		
		return result;
	}
	
	public Abrechnung getAbrechnungByPosition (Integer position) {
		Abrechnung result = this.abrechnung[position];
		
		return result;
	}
	
	private void setAbrechnungByPosition (Abrechnung newAbrechnung, Integer positionOfNewAbrechnung) {
		Integer currentSizeOfAbrechnungsListe = this.getNumberOfAbrechnungen();
		
		if (positionOfNewAbrechnung >= 0 && positionOfNewAbrechnung <= currentSizeOfAbrechnungsListe) {
			this.abrechnung[positionOfNewAbrechnung] = newAbrechnung;
		}
		
		return;
	}
	
	public void shiftLeftByPosition (Integer startingPosition) {
		Integer currentSizeOfAbrechnungsliste = this.getNumberOfAbrechnungen();
		
		if (startingPosition > 0 && startingPosition <= currentSizeOfAbrechnungsliste) {
			for (Integer currentPosition = startingPosition; currentPosition < currentSizeOfAbrechnungsliste; currentPosition += 1) {
				Abrechnung currentAbrechnung = this.getAbrechnungByPosition(currentPosition);
				
				this.setAbrechnungByPosition(currentAbrechnung,  currentPosition - 1);
			}
			
			this.setAbrechnungByPosition(null, currentSizeOfAbrechnungsliste);
			this.decrementNumberOfAbrechnungen();
		}
		
		return;
	}
	
	public void removeAbrechnungByPosition (Integer positionOfAbrechnung) {
		if (positionOfAbrechnung >= 0 && positionOfAbrechnung < this.getNumberOfAbrechnungen()) {
			if (positionOfAbrechnung == this.getSizeOfAbrechnungsliste() - 1) {
				this.setAbrechnungByPosition(null, positionOfAbrechnung);
			}
			else {
				this.shiftLeftByPosition(positionOfAbrechnung + 1);
			}
		}
	}
}
