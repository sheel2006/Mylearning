package CollectionPrac;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterators {

	public static void main(String[] args) {
		ArrayList<String>ls = new ArrayList<String>();
		ls.add("A");
		ls.add("B");
		ls.add("C");
		ListIterator<String>lm = ls.listIterator();
		while(lm.hasNext()){
			System.out.println(lm.next());
			System.out.println(lm.hasPrevious());
			System.out.println(lm.);
		}
		
	}

}
