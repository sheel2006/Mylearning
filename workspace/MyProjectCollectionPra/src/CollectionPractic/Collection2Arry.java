package CollectionPractic;

import java.util.ArrayList;

public class Collection2Arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String>ls = new ArrayList<String>();
    ls.add("EmpA");
    ls.add("EmpB");
    ls.add("EmpC");
    ls.add("EmpD");
    String str[]= new String [ls.size()];
    ls.toArray(str);
    for(String st:ls){
    	System.out.println(st);
    }
    
    
    
    
	}

}
