package MapInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap ma = new HashMap();
 ma.put(111, "EmpA");
 ma.put(111, "EmpA");
 ma.put(222, "EmpB");
 ma.put(333, "EmpC");
 ma.put(444, "EmpD");
    System.out.println(ma);
    Set s = ma.keySet();//keySet() method return Set inferface
    System.out.println(s);
     Iterator ts =   s.iterator();
 while(ts.hasNext()){
	 Object obj =(Object)ts.next();
	 System.out.println(obj.toString());
 }
    Collection c = ma.values();
    System.out.println(c);
    Set ss = ma.entrySet();
    System.out.println(ss);
    Iterator it =ss.iterator();
     while(it.hasNext()){
    	Map.Entry me= (Map.Entry)it.next();//Map is interface and entry is subinterface
    	System.out.println(me.getKey()+"------"+me.getValue());
    	/*Object obj=(Object)it.next();
    	System.out.println(obj.toString());*/   }}}