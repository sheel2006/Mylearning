import java.util.ArrayList;
public class GenericCollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	emp e1 = new emp(10,"EmpA" );
	emp e2 = new emp(20,"EmpB" );
	emp e3 = new emp(30,"EmpC" );
	emp e4=  new emp(40,"EmpD" ); 
	
	ArrayList<emp>al = new ArrayList<emp>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(1, e4);
	al.remove(e1);
	// To remove 3 elememt use index with built in method or use another way 
	// 1st approch to delete
	   al.remove(2);
	/*Second approch
	Integer i = new Integer(10);
	al.add(i);
	al.remove(i);
	*/
	
	for(emp obj:al){// Here we know "Type of collection data" which is emp. Here we are not using any type cast or instance 
		System.out.println(obj.empid+"-----"+obj.ename);
	}	}

	}


