import javax.swing.*;

public class Aufgabe_1 {
	public static void main (String [] args) {
		new DialogKundeBearbeiten();
	}

	public static class DialogKundeBearbeiten extends JDialog {
		public DialogKundeBearbeiten () {
			setTitle("Kunde bearbeiten");
			setSize(400, 300);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setVisible(true);
		}
	}
}
