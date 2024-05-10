import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class Aufgabe_5 {
	public static void main (String [] args) {
		Kunde kunden [] = new Kunde [3];
		
		kunden[0] = new Kunde("Meier", "Josef");
		kunden[1] = new Kunde("Gandalf", "Franz");
		kunden[2] = new Kunde("Frodo", "Beutlin");
		
		new Kundenverwaltung(kunden);
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
		private KundeTableModel kundeTableModel;
		private ListSelectionModel kundeSelectionModel;
		
		public Kundenverwaltung (Kunde [] kunden) {
			setTitle("Kundenverwaltung");
			setSize(500, 500);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			kundeTableModel = new KundeTableModel(kunden);
			JTable table = new JTable(kundeTableModel);
			
			kundeSelectionModel = table.getSelectionModel();
			kundeSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			table.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent event) {
					if (event.getClickCount() == 2) editKunde();
				}
			});
			
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			JScrollPane scrollpane = new JScrollPane(table);
			JPanel titlepane = new JPanel();
			titlepane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Tabellenansicht"));
			titlepane.setLayout(new BorderLayout());
			titlepane.add(scrollpane);
			
			add(titlepane);
			
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
		
		private void editKunde () {
			int rowNr = kundeSelectionModel.getMinSelectionIndex();
			
			new KundeBearbeitenDialog(this, kundeTableModel.getKunde(rowNr));
			
			kundeTableModel.fireTableRowsUpdated(rowNr, rowNr);
			
		}
		
		private JMenuItem getNewMenuItemKundebearbeiten () {
			JMenuItem result = new JMenuItem();
			
			result.setText("Kunde bearbeiten");
			
			result.addActionListener(new ActionListener () {
				public void actionPerformed(ActionEvent event) {
					editKunde();
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
	
	public static class KundeTableModel extends AbstractTableModel {
		private Kunde [] kunden;
		
		public KundeTableModel(Kunde [] kunden) {
			this.kunden = kunden;
		}
		
		public String getColumnName(int columnNr) {
			switch (columnNr) {
			case 0: return "Nachname";
			case 1: return "Vorname";
			default: return null;
			}
		}
		
		public int getRowCount () {
			return kunden.length;
		}
		
		public int getColumnCount () {
			return 2;
		}
		
		public Object getValueAt(int rowNr, int columnNr) {
			Kunde kunde = kunden[rowNr];
			switch (columnNr) {
			case 0: return kunde.getNachname();
			case 1: return kunde.getVorname();
			default: return null;
			}
		}
		
		public Kunde getKunde (int rowNr) {
			return kunden[rowNr];
		}
	}
}
