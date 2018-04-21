package CollectionPractic;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String>ls = new ArrayList<String>();
		    ls.add("EmpB");
		    ls.add("EmpC");
		    ls.add("EmpA");
		    ls.add("EmpD");
		    Collections.sort(ls);
		    for(String str:ls){
		    	System.out.println(str);
		    }
	}

}
