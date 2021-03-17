/*example to illustrate static method*/
class ExampleStatic{
	static void display(int x,int y){
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		
	}
	
	public static void main(String args[]){
		int x=10;
		int y=20;
		//ExampleStatic es = new ExampleStatic();
		//es.display(x,y);
		display(x,y);
	}
}