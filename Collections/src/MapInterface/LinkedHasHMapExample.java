package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHasHMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap h = new HashMap();
      h.put("111","EmpC");
      h.put("222","EmpC");
	
	  LinkedHashMap hm = new LinkedHashMap(h);
      hm.put(111, "EmpA");
      hm.put(121, "EmpB");
      
      Set ss = hm.entrySet();
     Iterator it = ss.iterator();
      while(it.hasNext()){
    	  Map.Entry em= (Map.Entry)it.next();
    	  System.out.println(em.getKey()+"     "+em.getValue());
      }
	}

}
