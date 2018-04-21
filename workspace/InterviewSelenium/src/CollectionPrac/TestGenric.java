package CollectionPrac;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> al = new ArrayList<Emp>(); 
		al.add(new Emp(10,"A"));
		al.add(new Emp(20,"B"));
		ArrayList<Emp> a2 = new ArrayList<Emp>(); 
		a2.addAll(al);
		a2.add(new Emp(50,"D"));
		a2.add(new Emp(30,"C"));
		 for(Emp em:a2){
			 System.out.println(em.eid+"    "+em.ename);
		 }
	    
	}

}
