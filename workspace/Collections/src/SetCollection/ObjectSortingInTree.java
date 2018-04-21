package SetCollection;

import java.util.Collections;
import java.util.TreeSet;

public class ObjectSortingInTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        emp e1 = new emp(20,"EmpA");
        emp e2 = new emp(30,"EmpB");
        emp e3 = new emp(40,"EmpC");
        emp e4 = new emp(10,"EmpD");
        TreeSet<emp> ts =new TreeSet<emp>(new EmpNameSort());// This is second kind of construtor
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        for(emp e:ts){
        	System.out.println(e.empid+"---------------"+e.ename);
          }}}
