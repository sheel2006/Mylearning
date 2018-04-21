package StringClassDay1;

public class Example3 {

	public static void main(String[] args) {
		Example3 exm  = new Example3();
		System.out.println( exm);
		System.out.println(exm.toString());//this will print hashcode value

		//conversation of string to stringbuffer
		String Str =" Hello World";
		StringBuffer st = new StringBuffer(Str);
		st.reverse();
		System.out.println(st);
		
		//conversation of Stringbuffer to string
		StringBuffer st1 = new StringBuffer("Hello World");
		String ss = st1.toString();
		System.out.println(ss);
		
	}

}
