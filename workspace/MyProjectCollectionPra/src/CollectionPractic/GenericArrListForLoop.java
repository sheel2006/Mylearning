package CollectionPractic;

import java.util.ArrayList;

public class GenericArrListForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<emp>al = new ArrayList<emp>();
        al.add(new emp(10,"EmpA"));
		al.add(new emp(20,"EmpB"));
		al.add(new emp(30,"EmpC"));
	for(emp e:al){
		System.out.println(e.empid+"     "+e.empname);
	}
		
	
	}

}
