package Practice;

abstract class Example1C implements Example1I{

	@Override
	public void m1() {
		System.out.println("M1 implemention");
		
	}
	
	public static void main(String[] args) {
		//new Example1C().m1(); object creation not possible
	}

	

}
