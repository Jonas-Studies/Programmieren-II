import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Aufgabe_4 {
	public static void main (String [] args) {
		new Kundenverwaltung();
	}
	
	public static class Kunde {
		private String nachname;
		private String vorname;
		
		public Kunde (String nachname, String vorname) {
			this.setNachname(nachname);
			this.setVorname(vorname);
		}
		
		public String getNachname () { return this.nachname; }
		public void setNachname (String nachname) { this.nachname = nachname; }
		
		public String getVorname () { return this.vorname; }
		public void setVorname (String vorname) { this.vorname = vorname; }
	}
	
	public static class KundeBearbeitenDialog extends JDialog {
		Kunde kunde;
		
		private JTextField txtNachname;
		private JTextField txtVorname;
		private JButton save_button = new JButton("Speichern");
		private JButton cancel_button = new JButton("Abbrechen");
		
		public KundeBearbeitenDialog (JFrame parent, Kunde zuBearbeitenderKunde) {
			super(parent);
			setModal(true);
			
			this.kunde = zuBearbeitenderKunde;
			
			setTitle("Kunde bearbeiten");
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			setLayout(new GridLayout(3, 2));
			
			// Zeile mit Überschriften
			add(new JLabel("Nachname"));
			add(new JLabel("Vorname"));
			
			// Zeile mit Inputfeldern
			add(txtNachname = new JTextField(this.kunde.getNachname()));
			add(txtVorname = new JTextField(this.kunde.getVorname()));
			
			// Zeile mit Buttons
			add(save_button);
			add(cancel_button);
			
			save_button.addActionListener(new save_button_handler());
			cancel_button.addActionListener(new cancel_button_handler());
			
			pack();
			setVisible(true);
		}
		
		private class save_button_handler implements ActionListener  {
			public void actionPerformed (ActionEvent event) {
				kunde.setNachname(txtNachname.getText());
				kunde.setVorname(txtVorname.getText());
				
				dispose();
			}
		}

		private class cancel_button_handler implements ActionListener  {
			public void actionPerformed (ActionEvent event) {
				dispose();
			}
		}
	}
	
	public static class Kundenverwaltung extends JFrame {
		private Kunde kunde;
		
		public Kundenverwaltung () {
			setTitle("Kundenverwaltung");
			setSize(500, 500);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			this.kunde = new Kunde("Dampf", "Hans");
			
			JMenuBar menuBar = getNewMenuBar();
			setJMenuBar(menuBar);
			
			setVisible(true);
		}
		
		private JMenuBar getNewMenuBar () {
			JMenu menu = new JMenu();
			
			JMenuBar result = new JMenuBar();
			
			menu.setText("Datei");
			
			result.add(menu);
			
			menu.add(getNewMenuItemKundebearbeiten());
			menu.add(new JSeparator());
			menu.add(getNewMenuItemBeenden());
			
			return result;
		}
		
		private JMenuItem getNewMenuItemKundebearbeiten () {
			JMenuItem result = new JMenuItem();
			
			result.setText("Kunde bearbeiten");
			
			result.addActionListener(new ActionListener () {
				public void actionPerformed(ActionEvent event) {
					new KundeBearbeitenDialog(Kundenverwaltung.this, kunde);
				}
			});
			
			return result;
		}
		
		private JMenuItem getNewMenuItemBeenden() {
			JMenuItem result = new JMenuItem();
			
			result.setText("Beenden");
			
			result.addActionListener(new ActionListener () {
				public void actionPerformed(ActionEvent event) {
					dispose();
				}
			});
			
			return result;
		}
	}
}
