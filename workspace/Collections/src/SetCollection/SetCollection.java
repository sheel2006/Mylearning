package SetCollection;

import java.util.HashSet;
import java.util.Iterator;

public class SetCollection {

	public static void main(String[] args) {
		HashSet<Integer>hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(10);
		hs.add(null);
		hs.add(null);
		
	Iterator it	= hs.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	}

}
