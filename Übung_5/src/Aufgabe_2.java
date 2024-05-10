import javax.swing.*;

public class Aufgabe_2 {
	public static void main (String [] args) {
		new Kundenverwaltung();
	}

	public static class DialogKundeBearbeiten extends JDialog {
		public DialogKundeBearbeiten (JFrame parent) {
			super(parent);
			setModal(true);
			
			setTitle("Kunde bearbeiten");
			setSize(400, 300);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setVisible(true);
		}
	}
	
	public static class Kundenverwaltung extends JFrame {
		public Kundenverwaltung() {
			setTitle("Kundenverwaltung");
			setSize(500, 500);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			setVisible(true);
			
			new DialogKundeBearbeiten(this);
		}
	}
}
