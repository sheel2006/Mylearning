package practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<emp>h = new HashSet<emp>();
		h.add(new emp(30,"empC"));
		h.add(new emp(20,"empA"));
		h.add(new emp(10,"empB"));
		for(emp e:h){
			System.out.println(e.empid+"--"+e.ename);
		}
		System.out.println("---------------------------------");
		LinkedHashSet<emp>hs = new LinkedHashSet<emp>();
		hs.add(new emp(30,"empa"));
		hs.add(new emp(40,"empb"));
		Iterator<emp>it=hs.iterator();
		while(it.hasNext()){
			emp e = it.next();
			System.out.println(e.empid+"---"+e.ename);
		}
		

	}

}
