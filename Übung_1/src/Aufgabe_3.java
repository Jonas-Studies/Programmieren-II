public class Aufgabe_3 {
	private double x1;
	private double x2;
	
	public static void main(String[] args) {
		Aufgabe_3 quadratic_formular_result = new Aufgabe_3();
		
		quadratic_formular_result = get_quadratic_formular_result(1.0, 2.0, 1.0);
		
		System.out.println("x1=" + Double.toString(quadratic_formular_result.x1) + ", x2=" + Double.toString(quadratic_formular_result.x2));
		
	}
	
	private static Aufgabe_3 get_quadratic_formular_result(double a, double b, double c) {
		Aufgabe_3 result = new Aufgabe_3();
		
		//System.out.println("Method get_quadratic_formular_result called with a=" + Double.toString(a) + ", b=" + Double.toString(b) + ", c=" + Double.toString(c));
		
		double value_below_squareroot = b * b - 4 * a * c;
		
		//System.out.println("Calculated the value below the squareroot as b^2 - 4 * a * c with " + Double.toString(value_below_squareroot) + " as result");
		
		double value_from_squareroot = Math.sqrt(value_below_squareroot);
		
		//System.out.println("Calculated the value of the squareroot with " + Double.toString(value_from_squareroot) + " as result");
		
		result.x1 = (-b + value_from_squareroot) / 2 * a;
		result.x2 = (-b - value_from_squareroot) / 2 * a;
		
		return result;
	}

}
