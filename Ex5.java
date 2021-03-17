/*Implement a calculator using command line arguments*/
class Example5{
 public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		String op = args[1];
		int b = Integer.parseInt(args[2]);
		double res=0;
		switch(op) {
			case "+":
				res = a + b;
				break;
			case "-":
				res = a - b;
				break;
			case "x":
				res = a * b;
				break;
			case "/":
				res = a / b;
				break;
			default : break;
		}
		System.out.println(res);
	}
}
