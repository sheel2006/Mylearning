package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicatenumbers {
	
public static void main(String[] args) {
	//int [] arry = {10,20,30,40,50,50,50,10,20,30,20};
	String str = "Java2Novice";
	
	//HashMap<Integer,Integer>hs = new HashMap<Integer,Integer>();
	HashMap<Character,Integer>hs = new HashMap<Character,Integer>();
	
	char[] arry= str.toCharArray();
	
	for(Character it:arry){
		if(hs.containsKey(it)){
			hs.put(it, hs.get(it)+1);
		}
			else{
				hs.put(it,1);
			}
		}
System.out.println(hs);
	
	
}
	

}
