package StringClassDay2;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	Differnce between equals(), compare(), "==" methods
 * 
 *  Equals() method id define in object class and use for comaparing reference variable and also
 *  Equals() method override in "STRING" class and use to compare the data content 
 *  Equals() method no override in "STRINGBUFFER" class and use to compare the reference variable 
 *  Equals() method return boolean value
 *  
 * compareTo() method define in collections class
 * 
 * CompareTo() method return integer value and use uni code value if two string are equal its return '0', if not equal it return 1 or -1
 * 
 * "==" operator use for comparing the refernce variable like object t1 and t2
 *  
 */
		String st  = "Test";
		String st1 = "test";
		String st2 = "test";
		System.out.println(st.equalsIgnoreCase("test"));
		System.out.println(st.compareTo(st1));
		System.out.println(st1.compareTo(st2));
	}

}
