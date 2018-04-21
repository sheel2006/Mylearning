package CollectionPrac;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSet<Emp>hm = new HashSet<Emp>((Collection<? extends Emp>) new EnameComp());
      hm.add(new Emp(10,"B"));
      hm.add(new Emp(20,"A"));
      //  Collections.sort(hm, new EnameComp());
      for(Emp e : hm){
    	  System.out.println(e.eid+e.ename);
      }
	}

}
