package Pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<emp>al = new ArrayList<emp>();
al.add(new emp(10,"TestA"));
al.add(new emp(10,"TestD"));
al.add(new emp(10,"TestC"));
al.add(new emp(10,"TestB"));
Collections.sort(al,new EnameComp());
System.out.println(al);
Iterator<emp>it =al.iterator();
while(it.hasNext()){
	emp e = it.next();
	System.out.println(e.ename);
}

	}

}
