package Pratice;

public class Example5C extends Example5P {

	Example5C(){
		super();
		System.out.println("Contrustor from child class");
		
	}
	
	public static void main(String[] args) {
		
		Example5P em = new Example5C();
		
		
	}

}
