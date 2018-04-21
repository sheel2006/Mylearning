package Pratice;

public class Example4C extends Example4P {

	
	int m1(int i) {
		System.out.println(" method implements for int "+i);
		return i;
	}

	String m1(String i) {
		System.out.println(" method implements for int "+i);
		return i;
	}
 public static void main(String[] args) {
	 Example4C em= new Example4C();
	 em.m1(10);
	 em.m1("Test");
}

}
