package Aufgabe_1;

public class Gehaltsabrechnung extends Abrechnung {
	private double gehalt;
	
	public double getGehalt () { return this.gehalt; }
	public void setGehalt (double newGehalt) { this.gehalt = newGehalt; }
	
	public Gehaltsabrechnung (int periode, Mitarbeiter mitarbeiter, double gehalt) {
		super(periode, mitarbeiter);
		
		this.setGehalt(gehalt);
		
		return;
	}
	
	public double getVerdienst () {
		double result = this.getGehalt();
		
		return result;
	}
}
