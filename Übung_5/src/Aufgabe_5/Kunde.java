package Aufgabe_5;

class Kunde {
	private String Nachname;
	private String Vorname;
	
	public Kunde (String newNachname, String newVorname) {
		this.setNachname(newNachname);
		this.setVorname(newVorname);
	}
	
	public void setNachname (String newNachname) { this.Nachname = newNachname; }
	public String getNachname () { return this.Nachname; }
	
	public void setVorname (String newVorname) { this.Vorname = newVorname; }
	public String getVorname () { return this.Vorname; }

}
