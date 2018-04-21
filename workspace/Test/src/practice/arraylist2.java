package practice;

import java.util.ArrayList;

public class arraylist2 {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(new emp(10,"ABC"));
		al.add(new emp(20,"BCD"));
		al.add(new student(10,"StuA"));
		al.add(10);
		System.out.println(al);
		for(Object obj: al){
			if(obj instanceof emp){
				emp e =(emp)obj;
				System.out.println(e.empid+"-------"+e.ename);
				
			}
			if(obj instanceof student){
				student st=(student)obj;
				System.out.println(st.stname+"--------------"+st.stid);
			}
			if(obj instanceof Integer){
				System.out.println(obj);
			}
		}
		
	}

}
