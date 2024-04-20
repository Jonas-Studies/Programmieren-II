
public class Mitarbeiter {
	private static Integer numberOfIDsCreated = 0;
	
	private Integer ID;
	private String name;
	
	public Integer getID () { return this.ID; }
	private void setID (Integer newID) { this.ID = newID; }
	
	public String getName () { return this.name; }
	public void setName (String newName) { this.name = newName; }
	
	public Mitarbeiter (String NewMitarbeitersName) {
		this.setID(Mitarbeiter.numberOfIDsCreated += 1);
		this.setName(NewMitarbeitersName);
		
		return;
	}
	
	public String toString () {
		String result = "Mitarbeiter Nr: " + this.getID() + ", Name: " + this.getName();
		
		return result;
	}
	
	public boolean istKleiner (Mitarbeiter mitarbeiterToCompareTo) {
		boolean result = false;
		
		if (this.getName().charAt(0) < mitarbeiterToCompareTo.getName().charAt(0)) {
			result = true;
		}
		
		return result;
	}
}
