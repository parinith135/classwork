class ExampleStatic1{
	static int a=10;
	void display_a(){
		System.out.println("a value: "+a);
		
	}
	//static block, it will be executed before main, once
	//static{System.out.println("Inside Static block");a=20;}
	
	//constructor, here we overrride the default constructor
	ExampleStatic1(){
		a++;
	}
	
	public static void main(String args[]){
		ExampleStatic1 es1 = new ExampleStatic1();
		es1.display_a();
		ExampleStatic1 es2 = new ExampleStatic1();
		es2.display_a();
		//System.out.println("a value"+es.a);
	}
}
		