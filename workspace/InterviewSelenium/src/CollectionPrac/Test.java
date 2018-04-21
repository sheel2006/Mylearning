package CollectionPrac;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
		al.add(10);
		al.add(new Emp(10,"A"));
		al.add(new Emp(20,"B"));
		al.add(new Student(100,"StuA"));
		al.add(new Student(200,"StuB"));
		
		al.remove(0);
		System.out.println(al);
	   for( Object obj:al){
		   if(obj instanceof Emp ){
			  Emp e =(Emp)obj;
			  System.out.println(e.eid+"-----"+e.ename);
			  
		   }
		   if( obj instanceof Integer){
			   System.out.println(obj.toString());
		   }
		   
	   }
		

	}

}
