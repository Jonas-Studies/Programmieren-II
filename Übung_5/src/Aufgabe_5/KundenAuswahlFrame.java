package Aufgabe_5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

class KundenAuswahlFrame extends JFrame {
	KundenTable kundenTable;
	
	public KundenAuswahlFrame (Kunde [] auswaehlbareKunden) {
		this.setTitle("Kundenverwaltung");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.kundenTable = new KundenTable(auswaehlbareKunden);
		
		this.add(new TitlePane(kundenTable));
		
		this.setJMenuBar(new MenuBar());
		
		this.setVisible(true);
	}
	
	private void editSelectedKunde () {
		Kunde zuBearbeitenderKunde = this.kundenTable.getSelectedKunde();
		
		new KundeBearbeitenDialog(this, zuBearbeitenderKunde);
		
		this.kundenTable.fireSelectedTableRowUpdated();
	}
	
	private class TitlePane extends JPanel {
		public TitlePane (JTable table) {
			JScrollPane scrollpane = new JScrollPane(table);

			this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Tabellenansicht"));
			this.setLayout(new BorderLayout());
			this.add(scrollpane);
		}
	}
	
	private class KundenTable extends JTable {
		private KundenTableModel kundenTableModel;
		private ListSelectionModel kundenSelectionModel;
		
		public KundenTable (Kunde [] kunden) {
			this.kundenTableModel = new KundenTableModel(kunden);
			this.setModel(this.kundenTableModel);
			
			kundenSelectionModel = this.getSelectionModel();
			kundenSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			this.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			
			this.addMouseListener(new MouseAdapter () {
				public void mousePressed(MouseEvent event) {
					if (event.getClickCount() == 2) {
						editSelectedKunde();
					}
				}
			});
		}
		
		public Kunde getSelectedKunde () {
			int selectedRowNr = this.kundenSelectionModel.getMaxSelectionIndex();
			
			return this.kundenTableModel.getKunde(selectedRowNr);
		}
		
		public void fireSelectedTableRowUpdated() {
			int selectedRowNr = this.kundenSelectionModel.getMaxSelectionIndex();
			
			this.kundenTableModel.fireTableRowsUpdated(selectedRowNr, selectedRowNr);
		}
		
		private class KundenTableModel extends AbstractTableModel {
			private Kunde [] kunden;
			
			public KundenTableModel(Kunde [] kunden) {
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
	
	private class MenuBar extends JMenuBar {
		public MenuBar () {
			this.add(new Menu());
		}
		
		private class Menu extends JMenu {
			public Menu () {
				this.setText("Datei");
				
				this.add(new MenuItemKundeBearbeiten());
				this.add(new JSeparator());
				this.add(new MenuItemBeenden());
			}
			
			private class MenuItemKundeBearbeiten extends JMenuItem {
				public MenuItemKundeBearbeiten () {
					this.setText("Kunde Bearbeiten");
					
					this.addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent event) {
							if (kundenTable.kundenSelectionModel.isSelectionEmpty() == false) {
								editSelectedKunde();
							}
						}
					});
				}
			}
			
			private class MenuItemBeenden extends JMenuItem {
				public MenuItemBeenden() {
					this.setText("Beenden");
					
					this.addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent event) {
							dispose();
						}
					});
				}
			}
		}
	}
}
