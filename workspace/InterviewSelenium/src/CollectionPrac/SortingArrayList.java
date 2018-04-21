package CollectionPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingArrayList {

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>(); 
		al.add(new Emp(333,"ratan"));
		al.add(new Emp(222,"anu"));  
		al.add(new Emp(111,"Sravya")); 
		al.add(new Emp(444,"xxx"));
		
		Collections.sort(al,new EnameComp());
		Iterator<Emp> itr = al.iterator();
		while (itr.hasNext()) 
		{ Emp e = itr.next();
		System.out.println(e.ename); 
		}

	}

}
