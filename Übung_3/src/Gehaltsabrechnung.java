
public class Gehaltsabrechnung extends Abrechnung {
	private double gehalt;
	
	public double getGehalt () { return this.gehalt; }
	public void setGehalt (double newGehalt) { this.gehalt = newGehalt; }
	
	public Gehaltsabrechnung (int periode, Mitarbeiter mitarbeiter, double gehalt) {
		this.setGehalt(gehalt);
		
		return;
	}
	
	public double getVerdienst () {
		double result = 0.0;
		
		return result;
	}
}
