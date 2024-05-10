package Aufgabe_5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class KundeBearbeitenDialog extends JDialog {
	private Kunde kunde;
	
	private JTextField nachname_textField;
	private JTextField vorname_textField;
	
	private JButton save_button = new JButton("Speichern");
	private JButton cancel_button = new JButton("Abbrechen");
	
	public KundeBearbeitenDialog (JFrame parent, Kunde zuBearbeitenderKunde) {
		super(parent);
		setModal(true);
		
		this.kunde = zuBearbeitenderKunde;
		
		this.setTitle("Kunde bearbeiten");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setLayout(new GridLayout(3, 2));
		
		this.add(new JLabel("Nachname"));
		this.add(new JLabel("Vorname"));
		
		this.nachname_textField = new JTextField(this.kunde.getNachname());
		this.add(nachname_textField);
		
		this.vorname_textField = new JTextField(this.kunde.getVorname());
		this.add(vorname_textField);
		
		this.add(save_button);
		this.add(cancel_button);
		
		this.save_button.addActionListener(new SaveButton_handler());
		this.cancel_button.addActionListener(new CancelButton_handler());
		
		this.pack();
		this.setVisible(true);
	}
	
	private class SaveButton_handler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			kunde.setNachname(nachname_textField.getText());
			kunde.setVorname(vorname_textField.getText());
			
			dispose();
		}
	}
	
	private class CancelButton_handler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			dispose();
		}
	}
}
