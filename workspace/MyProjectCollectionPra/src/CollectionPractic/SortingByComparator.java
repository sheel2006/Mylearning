package CollectionPractic;

import java.util.ArrayList;
import java.util.Collections;

public class SortingByComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<emp> al= new ArrayList<emp>();
		al.add(new emp(40,"EmpA"));
		al.add(new emp(20,"EmpB"));
		al.add(new emp(30,"EmpC"));
		al.add(new emp(10,"EmpD"));
	
		Collections.sort(al, new SortingByComparatorEmpid());
		for(emp em:al){
			System.out.println(em.empid+"      "+em.empname);
		}
		Collections.sort(al, new SortingByNameGenricEname());
		for(emp em:al){
			System.out.println(em.empid+"      "+em.empname);
		}
	}

}
