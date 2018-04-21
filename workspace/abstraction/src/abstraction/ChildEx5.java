package abstraction;

public class ChildEx5 extends ParentEx5 {
	
	int m1(int i){
		//System.out.println("Return Method");
		return i;
	}
   String m2(String j){
	   //System.out.println("Return String Method");
	   return j;
   }
   public static void main(String[] args) {
	   ChildEx5 ch = new ChildEx5();
	   ch.m1(10);
	   System.out.println("M1 Method return "+ch.m1(10));
	   ch.m2("Test");
	   System.out.println("M1 Method return "+ch.m2("Test"));
/* abstract method return value.
 * 
 */
}
   
}
