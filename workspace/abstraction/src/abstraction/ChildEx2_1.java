package abstraction;

public class ChildEx2_1 extends ChildEx2{
	
	void m3(){
		System.out.println("M3 Method from ChildEx2");
	}
public static void main(String[] args) {
	ChildEx2_1 ch = new ChildEx2_1();
	ch.m1();
	ch.m2();
	ch.m3();
}
}
/* in This example "ParentEx2" have 3(m1,m2,m3) abstract method, 2(m1,m2) method implements in ChildEx2 
 * but m3 method not implements. So ChildEx2 become abstract class ...now ChildEx2 extends in ChildEx3 and m3 method
 * declare.  
 * */
