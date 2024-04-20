
public class Mitarbeiterliste {
	private Mitarbeiter mitarbeiter [];
	private Integer numberOfUsedElements = 0;
	
	public Integer getNumberOfUsedElements () {
		return this.numberOfUsedElements;
	}
	private void incrementNumberOfUsedElements () {
		this.numberOfUsedElements += 1;
		
		return;
	}
	private void decrementNumberOfUsedElements () {
		this.numberOfUsedElements -= 1;
		
		return;
	}
	
	public Mitarbeiterliste (Integer newListsSize) {
		this.mitarbeiter = new Mitarbeiter [newListsSize];
		
		return;
	}
	
	public Integer getSize () {
		Integer result = this.mitarbeiter.length;
		
		return result;
	}
	
	public Boolean addMitarbeiter (Mitarbeiter mitarbeiterToAdd) {
		Boolean result = false;
		
		if (this.getNumberOfUsedElements() < this.getSize()) {
			this.mitarbeiter[getNumberOfUsedElements()] = mitarbeiterToAdd;
			this.incrementNumberOfUsedElements();
			
			result = true;
		}
		
		return result;
	}
	
	public Mitarbeiter getMitarbeiterByPosition(Integer positionOfMitarbeiter) {
		Mitarbeiter result = null;
		
		if (positionOfMitarbeiter >= 0 && positionOfMitarbeiter <= getNumberOfUsedElements()) {
			result = this.mitarbeiter[positionOfMitarbeiter];
		}
		
		return result;
	}
	
	public Mitarbeiter setMitarbeiterByPosition (int positionOfMitarbeiterToSet, Mitarbeiter mitarbeiterToSet) {
		Mitarbeiter result = null;
		
		if (positionOfMitarbeiterToSet >= 0 && positionOfMitarbeiterToSet <= getNumberOfUsedElements()) {
			result = this.getMitarbeiterByPosition(positionOfMitarbeiterToSet);
			
			this.mitarbeiter[positionOfMitarbeiterToSet] = mitarbeiterToSet;
		}
		
		return result;
	}
	
	public void swapMitarbeiterByPosition (int positionOfFirstMitarbeiter, int positionOfSecondMitarbeiter) {
		Mitarbeiter firstMitarbeiter = this.getMitarbeiterByPosition(positionOfFirstMitarbeiter);
		
		Mitarbeiter secondMitarbeiter = this.setMitarbeiterByPosition(positionOfSecondMitarbeiter, firstMitarbeiter);
		this.setMitarbeiterByPosition(positionOfFirstMitarbeiter, secondMitarbeiter);
		
		return;
	}
	
	public Boolean removeMitarbeiterByPosition (int positionOfMitarbeiterToRemove) {
		Boolean result = false;
		
		if (positionOfMitarbeiterToRemove >= 0 && positionOfMitarbeiterToRemove <= this.getNumberOfUsedElements()) {
			if (positionOfMitarbeiterToRemove == this.getSize()) {
				this.setMitarbeiterByPosition(positionOfMitarbeiterToRemove, null);
			}
			else {
				// Überschreibt das zu löschende Element und verhindert das ein leeres Element innerhalb der Liste entsteht
				this.shiftLeftByPositon(positionOfMitarbeiterToRemove + 1);
			}
			
			result = true;
		}
		
		return result;
	}
	
	public Integer getPositionOfMitarbeiter (Mitarbeiter mitarbeiterToGetPositionBy) {
		Integer result = null;
		
		for (Integer numberOfMitarbeiter = 0; numberOfMitarbeiter < this.getNumberOfUsedElements(); numberOfMitarbeiter += 1) {
			if (this.mitarbeiter[numberOfMitarbeiter] == mitarbeiterToGetPositionBy) {
				result = numberOfMitarbeiter;
				
				break;
			}
		}
		
		return result;
	}
	
	private void shiftLeftByPositon (Integer positionToStartShifting) {
		if (positionToStartShifting > 0 && positionToStartShifting <= this.getSize()) {
			for (Integer numberOfMitarbeiter = positionToStartShifting; numberOfMitarbeiter <= this.getNumberOfUsedElements(); numberOfMitarbeiter += 1) {
				this.setMitarbeiterByPosition(numberOfMitarbeiter - 1, this.getMitarbeiterByPosition(numberOfMitarbeiter));
			}
			
			this.setMitarbeiterByPosition(this.getNumberOfUsedElements(), null);
			this.decrementNumberOfUsedElements();
		}
		
		return;
	}
	
	public Boolean removeMitarbeiter (Mitarbeiter mitarbeiterToRemove) {
		Boolean result = false;
		
		Integer positionOfMitarbeiter = this.getPositionOfMitarbeiter(mitarbeiterToRemove);
		
		if (positionOfMitarbeiter != null) {
			result = this.removeMitarbeiterByPosition(positionOfMitarbeiter);
		}
		
		return result;
	}
}
