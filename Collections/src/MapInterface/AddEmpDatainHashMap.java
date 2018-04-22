package MapInterface;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AddEmpDatainHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<emp,student>hm = new HashMap<emp,student>();
		hm.put(new emp(10,"EmpA"), new student(10,"StuA"));
		hm.put(new emp(20,"EmpB"), new student(10,"StuB"));
		hm.put(new emp(30,"EmpC"), new student(10,"StuC"));
		hm.put(new emp(40,"EmpD"), new student(10,"StuD"));
		
		System.out.println(hm instanceof Serializable);
		System.out.println(hm instanceof Cloneable);
		
		Set s =hm.entrySet();
		Iterator it= s.iterator();
		while(it.hasNext()){
			Map.Entry em = (Map.Entry)it.next();
			emp e=(emp)em.getKey();
			System.out.println(e.empid+"------"+e.ename);
			student st1=   (student)em.getValue();
			System.out.println(st1.sname+"------"+st1.stuid);	}	}}
