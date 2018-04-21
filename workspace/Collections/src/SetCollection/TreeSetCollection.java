package SetCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		
		ts.add(20);
		ts.add(50);
		ts.add(10);
		ts.add(30);
		ts.add(40);
		
		Iterator it= ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(ts);	}}
