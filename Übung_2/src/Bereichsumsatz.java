
public class Bereichsumsatz {
	private String bereich;
	private Double umsatz;
	
	public void setBereich (String bereich) { this.bereich = bereich; }
	public String getBereich () { return this.bereich; }

	public void setUmsatz (Double umsatz) {
		if (umsatz >= 0) {
			this.umsatz = umsatz;
			
		} 
	}
	public Double getUmsatz () { return this.umsatz; }
	
	public Bereichsumsatz () {
		
	}
	
	public Bereichsumsatz(String bereich, Double umsatz) {
		setBereich(bereich);
		setUmsatz(umsatz);
		
	}
	
	public String toString () {
		String result = this.bereich + " (" + this.umsatz + ")";
		
		return result;
	}
	
}
