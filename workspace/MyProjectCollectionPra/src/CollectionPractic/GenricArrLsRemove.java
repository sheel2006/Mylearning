package CollectionPractic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class GenricArrLsRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<emp>ls = new ArrayList<emp>();
      ls.add(new emp(10,"EmpA"));
      ls.add(new emp(20,"EmpB"));
      ls.add(new emp(30,"EmpC"));
    //  ls.add(new emp(40,"EmpD"));
      
     ListIterator<emp> at=ls.listIterator();
     at.add(new emp(50,"EmpE"));
      while(at.hasNext())
      {
    	 emp e = at.next();
    	 if((e.empname).equals("EmpA"))
    	 {
    		 at.remove();
    	 }
    	
    	}
      for(emp em:ls){
  		System.out.println(em.empid+"  "+em.empname);
      }
	}

}
