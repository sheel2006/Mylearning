package SetCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  	emp e1 = new emp(20,"EmpA");
	        emp e2 = new emp(30,"EmpC");
	        emp e3 = new emp(40,"EmpB");
	        emp e4 = new emp(10,"EmpD");
	      TreeSet<emp> ts =new TreeSet<emp>(new EmpNameSort());// This is second kind of construtor
	        ts.add(e1);
	        ts.add(e2);
	        ts.add(e3);
	        ts.add(e4);
	      Iterator<emp> it=  ts.iterator();
	      while(it.hasNext()){
	    	  emp e = (emp)it.next();
	    	  System.out.println(e.empid+"------"+e.ename);
	      }
	      
	}

}
