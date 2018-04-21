package Type_Variable;

public class Assignment2 {
	int a =10;//instance variable
	int b =20;//instance variable
	static void m1(){
		// calling instance variable inside static block
		Assignment2 t = new Assignment2();
		System.out.println(t.a);
		System.out.println(t.b); }// Method is completed object destroyed 
	static void m2(){
		Assignment2 t1 = new Assignment2();
		System.out.println(t1.a);
		System.out.println(t1.b);	}
	public static void main(String[] args) {
	  m1();
	  m2();
	}
}
