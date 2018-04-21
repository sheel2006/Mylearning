package Popup;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Set_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set s = new HashSet();
     s.add("Table");
     s.add("pen");
     s.add("xxx");
     System.out.println("size before duplicate element --"+s.size());
     s.add("xxx");
     System.out.println("size after duplicate element --"+s.size());
     
     /*Differnce between List and set 
      * set not allowed to add duplicate element and its dynamically increase
      * No index and no order has define for set
      * set is is for pop-up or window handling
      */
     Iterator<String>it = s.iterator();
     //System.out.println(it.next());
     //System.out.println(it.next());
     //System.out.println(it.next());
     /* it.hasNext()return boolean value and check that next elemment present or not
      */
      while(it.hasNext()){
    	  System.out.println(it.next()); 
      }

}
}
