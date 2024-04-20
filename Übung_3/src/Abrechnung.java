
public abstract class Abrechnung {
	private int periode;
	private Mitarbeiter mitarbeiter;

	public int getPeriode () { return this.periode; }
	public void setPeriode (int newPeriode) { this.periode = newPeriode; }
	
	public Mitarbeiter getMitarbeiter () { return this.mitarbeiter; }
	public void setMitarbeiter (Mitarbeiter newMitarbeiter) { this.mitarbeiter = newMitarbeiter; }
	
	public Abrechnung (int periode, Mitarbeiter mitarbeiter) {
		this.setPeriode(periode);
		this.setMitarbeiter(mitarbeiter);
		
		return;
	}
	
	public abstract double getVerdienst ();
	
	public String toString () {
		String result = "PeriodenNr: " + this.getPeriode() + ", Name: " + this.getMitarbeiter().getName() + ", Verdienst: " + this.getVerdienst();
		
		return result;
	};

}
