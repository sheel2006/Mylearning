package StringClassDay2;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Difference between length and length()
 * 
 * length is variable and used to find the length of array and length() method use to find the length of string
 * 
 */
	
	int[] a = new  int [100];
	System.out.println(a.length);
	
	String str = "	Hello world";
	System.out.println(str.length());
	
	System.out.println(str.charAt(4));
	//System.out.println(str.charAt(110));
	
	System.out.println(str.indexOf('e'));
	
	System.out.println(str.contains("He"));
	
	System.out.println(str.startsWith("He"));
	
	System.out.println(str.endsWith("ld"));
	
	System.out.println(str.toUpperCase());
	
	System.out.println(str.toLowerCase());
	
	System.out.println(str.trim().length());
	
	System.out.println(str.length());
	
	
	}

}
