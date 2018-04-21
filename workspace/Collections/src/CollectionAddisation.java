import java.util.ArrayList;


public class CollectionAddisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e1 = new emp(10,"EmpA" );
		emp e2 = new emp(20,"EmpB" );
		emp e3 = new emp(30,"EmpC" );
		emp e4=  new emp(40,"EmpD" ); 
		
		ArrayList<emp>a1 = new ArrayList<emp>();
		a1.add(e1);
		a1.add(e2);
		ArrayList<emp>a2 = new ArrayList<emp>();
		a2.addAll(a1);// use to add collection
		a2.add(e3);
		a2.add(e4);
	//	System.out.println(a2.containsAll(a1));
		//System.out.println(a2.equals(a2));
		//System.out.println(a2.hashCode());
		//System.out.println(a2.removeAll(a1));
		System.out.println(a2.retainAll(a1));
		for(emp e:a2){
			System.out.println(e.empid+"===="+e.ename);
		}
		
	}

}
