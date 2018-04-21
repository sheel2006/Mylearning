package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.jaxen.util.LinkedIterator;


public class ArraylistExample {

	public static void main(String[] args) {
		
		ArrayList<emp>ls = new ArrayList<emp>();
		ls.add(new emp(111,"TestA"));
		ls.add(new emp(333,"TestD"));
		ls.add(new emp(444,"TestB"));
		ls.add(new emp(222,"TestC"));
	/*	
		for(emp e:ls){
			System.out.println(e.empid+"---"+e.ename);
		}
		
		*/
		Collections.sort(ls, new empSort());
		for(emp e:ls)
		System.out.println(e.empid+"----"+e.ename);
		}

	}


