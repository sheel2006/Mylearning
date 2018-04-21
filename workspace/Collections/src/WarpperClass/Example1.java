package WarpperClass;

public class Example1 {

	public static void main(String[] args) {
		String s ="100";// 
		int s1 = 10;
		Integer in = new Integer(s);// Interger having 2 construtor 1. for interger and 2nd is String 
		Integer in1 = new Integer(s1);//
		System.out.println(" Int construtor --"+in1);
		System.out.println(" String construtor --"+in);
		
		// Float value
		Float f1 = new Float(10.5);//double data
		System.out.println(f1);
		Float f2 = new Float(10.5f);//Float data
		System.out.println(f2);
		Float f3 = new Float("10.5");//String  data
	    System.out.println(f3);
	    
	    
	    Character c1 = new Character('a') ;
	    System.out.println(c1);
	    
	    Boolean b1  = new Boolean("Dalse1111");
	    System.out.println(b1);
	    
	    Example1 em = new Example1();
	    System.out.println(em);
	    System.out.println(em.toString());//Output of both lines are same..internally its use toString() methods
	    // Output of is className@hashcode
	}

}
