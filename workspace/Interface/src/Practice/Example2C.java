package Practice;

public class Example2C implements Example2I {

	@Override
	public void m1() {
		System.out.println("M1 method");
	//i=i+1;
		System.out.println(i);
		
	}

	@Override
	public void m2() {
		System.out.println("M2 method");
		
	}
	public static void main(String[] args) {
		Example2C em = new Example2C();
		em.m1();
		em.m2();
	}
	

}
