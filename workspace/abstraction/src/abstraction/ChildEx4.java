package abstraction;

public class ChildEx4 extends ParentEx4 {

	void m2(){
		System.out.println("Print instance variable  "+i);
		System.out.println("Print public varaible    "+j);
		System.out.println("Print Static varaible    "+l);
		System.out.println("Print final varaible     "+k);
	// Note that all variable define abstract class and we can call here.
	}
	public static void main(String[] args) {
		ChildEx4 ch = new ChildEx4();
		ch.m1();
		ch.m2();
		
	}
	
}
