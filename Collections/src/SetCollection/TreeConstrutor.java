package SetCollection;

import java.util.TreeSet;

public class TreeConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TreeSet ts = new TreeSet();
  ts.add(10);
  ts.add(20);
  
  TreeSet ts1 = new TreeSet(ts);//Third collection construtor
    ts1.add(40);
   
  System.out.println(ts1);
  
	}

}
