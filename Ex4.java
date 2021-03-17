/*Convert decimal to binary number*/
class Example4 {
	public static void main(String args[]) {
		int num = 9,i=0,j;
		int binary[] = new int[20];
		while(num > 0) {
			binary[i] = num % 2;
			num = num / 2;
			i++;
		}
		for(j=i-1;j>=0;j--) 
			System.out.println(binary[j]);
	}
}