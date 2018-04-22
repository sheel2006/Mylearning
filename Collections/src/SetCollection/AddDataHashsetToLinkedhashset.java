package SetCollection;

import java.util.HashSet;

public class AddDataHashsetToLinkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<Integer> hs = new HashSet<Integer>();
    hs.add(10);
    hs.add(20);
    HashSet hs1= new HashSet(hs);
    hs1.add("emp1");
    hs1.add("Emp2");
    System.out.println(hs1);
	
	HashSet h2 = new HashSet(hs1);
	System.out.println(h2);
	
	}
	
	

}
