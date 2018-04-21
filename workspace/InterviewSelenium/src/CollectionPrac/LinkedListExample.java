package CollectionPrac;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Emp> ls = new LinkedList<Emp>();
		ls.add(new Emp(10,"A"));
		ls.add(new Emp(20,"B"));
		ls.add(new Emp(30,"C"));
		ls.add(2, new Emp(40,"D"));
		ls.remove(0);
		for(Emp e: ls){
			System.out.println(e.eid + "  "+e.ename);
		}
		
		
	}

}
