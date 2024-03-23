
public class Aufgabe_2 {

	public static void main(String[] args) {
		int variableI = 1;
		int variableII = 2;
		
		System.out.println("Erste Variable: " + Integer.toString(variableI) + ", zweite Variable: " + Integer.toString(variableII));
		
		int temp = variableI;
		
		variableI = variableII;
		variableII = temp;
		
		System.out.println("Erste Variable: " + Integer.toString(variableI) + ", zweite Variable: " + Integer.toString(variableII));

	}

}
