public class StaticVsNostatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testclass obj1 = new Testclass();
		Testclass obj2 = new Testclass();
		++obj1.i;
		obj1.access();
		System.out.println("value of x " );
		obj2.access();
		System.out.println("value of x :" );
		
		
		
	}

}

