package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasHMapAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap hm = new HashMap();
  hm.put(111, "EmpA");
  hm.put(222, "EmpB");
  
  HashMap hm1 = new HashMap(hm);//Add HashMap data
  hm1.put(121, "EmpC");
  hm1.put(131, "EmpD");
 
  Set s= hm1.entrySet();
  Iterator it=s.iterator();
  
  while(it.hasNext()){
	  Map.Entry mk = (Map.Entry)it.next();
	 System.out.println(mk.getValue()+"----"+mk.getKey());}}}
