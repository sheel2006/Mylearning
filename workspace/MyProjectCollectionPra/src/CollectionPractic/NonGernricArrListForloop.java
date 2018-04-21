package CollectionPractic;

import java.util.ArrayList;

public class NonGernricArrListForloop{

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		al.add(new emp(10,"EmpA"));
		al.add(new emp(20,"EmpB"));
		al.add(new emp(30,"EmpC"));
		al.add(new student(11,"StuA"));
		al.add(new student(12,"StuB"));
		al.add(new student(13,"StuC"));
		for(Object obj:al){
			if(obj instanceof emp){
				emp e=(emp)obj;
				System.out.println(e.empid+"    "+e.empname);
			}
			if( obj instanceof student){
				student st=(student)obj;
			System.out.println(st.stuid+"    "+st.stuname);
			}
		}
		
		
		}
		
	}

