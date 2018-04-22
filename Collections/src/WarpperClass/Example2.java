package WarpperClass;

public class Example2 {

	public static void main(String[] args) {
		// Object Class toString method will be print like className@hashCode
		Example2 em = new Example2();
		System.out.println(em);
/*Explanation: 
 * when object refernce print its follow below internally
 * class Object{
 * public String toString(){
 * return"class-name@Hashcode"
 * }
 * } 
 */
		Integer i = new Integer(100);
		System.out.println(i);
		System.out.println(i.toString());
		/* Explanation: 
		 * when integer refernce print its follow below internally
		 * class Interger extends object(){
		 * public String toString(){
		 * here  overriding toString() method
		 * return "content of interger object"
		 * 
		 */
	}

}
