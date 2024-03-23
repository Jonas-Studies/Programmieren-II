
public class Aufgabe_6 {

	public static void main(String[] args) {
		double squareroot = get_squareroot(16);
		
		System.out.println(Double.toString(squareroot));

	}
	
	private static double get_squareroot(int number) {
		double result = 0;
		
		double precision = 0.1;
		
		double a = number / 2;
		double b = 2;
		
		boolean a_is_larger = false;
		
		if (a > b) {
			a_is_larger = true;
		}
		
		while (result == 0)
		{
			if (a == b) {
				result = a;
			}
			else {
				if (a_is_larger == true) {
					if (a < b) {
						result = b;
					}
					else {
						a -= precision;
						b = number / a;
					}
					
				}
				else {
					if (a > b) {
						result = a;
					}
					else {				
						b -= precision;
						a = number / b;
					}
					
				}
				
			}
			
		}
		
		return result;
	}

}
