package Polymorphism;

/*
Final  class variables are not a final but final class methods are by default final.
Final class methods are by default final because for the final class not possible to create subclasses 
hence it is not possible to override that method.  
 
 */
public final class Test {
   int i =10;
	void m1(){
		System.out.println("m1 method");
		i=i=10;
		System.out.println("Value of i "+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Test().m1();
	}

}
