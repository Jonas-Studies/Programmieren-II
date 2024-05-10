import java.awt.event.*;
import javax.swing.*;

public class Aufgabe_3 {
	public static void main (String [] args) {
		new Kundenverwaltung();
	}
	
	public static class KundeBearbeitenDialog extends JDialog {
		public KundeBearbeitenDialog (JFrame parent) {
			super(parent);
			setModal(true);
			
			setTitle("Kunde bearbeiten");
			setSize(400, 300);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			setVisible(true);
		}
	}
	
	public static class Kundenverwaltung extends JFrame {
		public Kundenverwaltung () {
			setTitle("Kundenverwaltung");
			setSize(500, 500);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
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
					new KundeBearbeitenDialog(Kundenverwaltung.this);
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
