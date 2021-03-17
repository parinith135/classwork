/* Program to find the root of quadratic eqn root1 = (-b + √(b2-4ac)) / (2a)  root2 = (-b - √(b2-4ac)) / (2a) */

import java.lang.Math;

class Quadratic1 {
	public static void main(String args[]) {
		double a=2.3,b=4, c=5.6;
		double root1, root2;
		double val = (b*b) - 4 * a * c;
		

		if(val>=0) {
			root1 = (-b + Math.sqrt(val))/ (2*a);
			root2 = (-b - Math.sqrt(val))/ (2*a);
			System.out.printf("root1 %.2f root2: %.2f" , root1, root2);

		}
		else if(val < 0) {
			double real = -b/(2*a);
			double imag = Math.sqrt(Math.abs(val))/(2*a);
			System.out.printf("root1 %.2f+i %.2f" , real, imag);
			System.out.printf("root2 %.2f-i %.2f" , real, imag);
		}
	}
}