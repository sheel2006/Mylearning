package CollectionPractic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenricwithIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<emp> al= new ArrayList<emp>();
		al.add(new emp(10,"EmpA"));
		al.add(new emp(20,"EmpB"));
		al.add(new emp(30,"EmpC"));
		ArrayList<student> al1= new ArrayList<student>();
		al1.add(new student(11,"StuA"));
		al1.add(new student(12,"StuB"));
		al1.add(new student(13,"StuC"));
		Iterator<emp> at= al.iterator();
		while(at.hasNext()){
			emp e = at.next();
			System.out.println(e.empid+"    "+e.empname);
			
			
		}
	}

}
