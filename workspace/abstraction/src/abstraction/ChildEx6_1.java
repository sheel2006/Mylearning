package abstraction;

public class ChildEx6_1 extends ChildEx6{
	
	void m2(){
		System.out.println("m2 method implements in ChildEx6_1");
	}
public static void main(String[] args) {
	ChildEx6_1 ch = new ChildEx6_1();
	ch.m1();
	ch.m2();
	
	/* Note That m2 will be drive from ChildEx6 not from ParentEx6 
	 * 
	 */
}
}
