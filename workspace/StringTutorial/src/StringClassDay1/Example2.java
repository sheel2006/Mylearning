package StringClassDay1;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "Hello";
    System.out.println(str);// here string not modified after data is created this known as inmutable 
    
    StringBuffer  st = new StringBuffer("Java");
    st.append("World");
    System.out.println( st);// Here stringBuffer is modified after data is created know as mutable
    
	}

}
