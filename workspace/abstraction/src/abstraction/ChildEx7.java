package abstraction;

public class ChildEx7 extends ParentEx7 {
	
	ChildEx7(){
		super();
		System.out.println("ChildEx7 Constructor");
	}
public static void main(String[] args) {
	ChildEx7 ch = new ChildEx7();
	
/* Remember that Object creation is not possible in abstract class but Construtor of abstract class executed.
 * 	
 */
}
}
