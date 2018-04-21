import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class CollectionRetriveForEachLoop {

	public static void main(String[] args) {
	// Normal version of data
	 ArrayList a1= new 	ArrayList();
	 a1.add(new emp(11,"aaa"));
	 System.out.println("1st Approch Print without Genric with type casting");
	 System.out.println("         ");
	 for(Object obj:a1){
		 if(obj instanceof emp){
			 emp e = (emp)obj;//Type Casting
			 System.out.println(e.empid+"------"+e.ename);
			 
		 }
		 
	 }
	 emp eee = (emp) a1.get(0);
	 System.out.println("         ");
	 System.out.println("1st Approch Print without Genric with get method");
	 System.out.println(eee.empid+"--------"+eee.ename);
	 
	
	// 2nd approch	//generic version of data
	 System.out.println("         ");
	 System.out.println("Print with Genric version --type safty");
	 System.out.println("         ");
	 
		ArrayList<emp>al = new ArrayList<emp>();
	    al.add(new emp(111,"EmpA"));
	    al.add(new emp(222,"EmpB"));
	    al.add(new emp(333,"EmpC"));
		for(emp a:al){
		System.out.println(a.empid+"------"+a.ename);
		
		
	}
	
	}
	

	

}
