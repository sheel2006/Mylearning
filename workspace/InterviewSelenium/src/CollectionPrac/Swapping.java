package CollectionPrac;

import java.util.ArrayList;
import java.util.Collections;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		System.out.println(al);
		Collections.swap(al, 0,1);
		System.out.println(al);
	}

}
