package CollectionPrac;

import java.util.ArrayList;

public class ArrayListAndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Emp(10,"A"));
		al.add(new Emp(20,"B"));
		al.add(new Student(100,"StuA"));
		al.add(new Student(200,"StuB"));
		
		Object[] obj =al.toArray();
		for(Object am:obj){
			if(am instanceof Emp){
				Emp em = (Emp)am;
				System.out.println(em.eid+"     "+em.ename);
			}
		}
	}

}
