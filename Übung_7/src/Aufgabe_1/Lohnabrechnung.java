package Aufgabe_1;

public class Lohnabrechnung extends Abrechnung {
	private double stundenLohn;
	private double anzahlStunden;
	
	public double getStundenLohn () { return this.stundenLohn; }
	public void setStundenLohn (double newStundenLohn) { this.stundenLohn = newStundenLohn; }

	public double getAnzahlStunden () { return this.anzahlStunden; }
	public void setAnzahlStunden (double newStundenAnzahl) { this.anzahlStunden = newStundenAnzahl; }
	
	public Lohnabrechnung (int periode, Mitarbeiter mitarbeiter, double stundenlohn, double stunden) {
		super(periode, mitarbeiter);
		
		this.setStundenLohn(stundenlohn);
		this.setAnzahlStunden(stunden);
	}
	
	public double getVerdienst() {
		double result = this.getStundenLohn() * this.getAnzahlStunden();
		
		return result;
	}
}
