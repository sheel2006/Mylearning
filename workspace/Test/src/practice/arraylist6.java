package practice;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String>al = new ArrayList<String>();
    al.add("aaaa");
    al.add("abaa");
    al.add("bcaa");
    al.add("adaa");
     Collections.sort(al);
    System.out.println(al);
    String[] s = new String[al.size()];
    al.toArray(s);
    for(int i = 0;i<s.length;i++){
    	System.out.println(s[i]);
    }
    
	}

}
