package Interview;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<emp>hs = new HashSet<emp>();
		hs.add(new emp(111,"EmpA"));
		hs.add(new emp(22,"EmpB"));
		hs.add(new emp(555,"EmpC"));
		hs.add(new emp(77,"EmpD"));
		hs.add(new emp(54,"EmpC"));
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
			emp e =(emp)it.next();
			System.out.println(e.ename+"  "+e.empid);
		}
		
		
		
		
		
	}

}
