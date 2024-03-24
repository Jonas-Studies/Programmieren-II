
public class Aufgabe_11 {
	
	public static void main (String [] args) {
		int rows = 6;
		
		for (int rowNr = 1; rowNr <= rows; rowNr += 1) {
			String row = "";
			
			for (int spaceNr = 1; spaceNr <= rows - rowNr; spaceNr += 1) {
				row += "  ";
			}
			
			for (int columnNr = 1; columnNr <= rowNr; columnNr += 1) {
				int number = get_pascal(rowNr, columnNr);
				
				row += "   " + Integer.toString(number);
				
			}
			
			System.out.println(row);
		}
		
		return;
	}
	
	private static int get_pascal (int rowNr, int columnNr) {
		int result = 0;
		
		if (rowNr == 1 || columnNr == 1 || columnNr == rowNr) {
			result = 1;
		}
		else if (columnNr > rowNr) {
			result = 0;
		}
		else {
			result = get_pascal(rowNr - 1, columnNr - 1) + get_pascal(rowNr - 1, columnNr);
		}
		
		return result;
	}

}
