package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrylist5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<emp>al = new ArrayList<emp>();
		al.add(new emp(10,"empA"));
		al.add(new emp(20,"empB"));
		al.add(new emp(30,"empC"));
		al.add(new emp(40,"empD"));
	/*	Iterator it = al.iterator();
		while(it.hasNext()){
			emp e = (emp)it.next();
			System.out.println(e.empid+"----"+e.ename);
		}
		System.out.println("=======================");
		Iterator <emp> it1=al.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next().empid+"====="+it1.next().ename);*/
		
	    System.out.println("***********************************");
	              ListIterator<emp>ls=al.listIterator();
	              ls.add(new emp(50,"empE"));
	              while(ls.hasNext()){
	            	  emp e =ls.next();
	            	  if((e.ename).equals("empA")){
	            		  ls.remove();
	            	  }
	          System.out.println(e.empid+"-----"+e.ename);
	              }
	        
		
		}
		
	}


