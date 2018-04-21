package practice;

import java.util.ArrayList;

public class arrylist3 {
	
	
	public static void main(String[] args) {
		
	emp e1=	new emp(10,"A");
	emp e2=	new emp(20,"B");
	emp e3=	new emp(30,"C");
	emp e4=	new emp(40,"D");
	
	
	ArrayList<emp>al = new ArrayList<emp>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	for(emp e:al){
	 
	 System.out.println(e.empid+"------"+e.ename);
	}
	
}
}
