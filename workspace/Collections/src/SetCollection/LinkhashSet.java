package SetCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkhashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList<Integer> hs = new LinkedList<Integer>();
 hs.add(10);
 hs.add(20);
 hs.add(30);
 hs.add(40);
 hs.add(50);
 hs.add(null);
 hs.add(null);
 Iterator it= hs.iterator();
 
 while(it.hasNext()){
	 System.out.println(it.next());
 }
 
	}

}
