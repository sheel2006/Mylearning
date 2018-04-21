import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class duplicateCharInString {

public void duplicatecount(String str){
	HashMap<Character,Integer>h1 = new HashMap<Character,Integer>();
	
	char[]chr = str.toCharArray();
	for(Character obj:chr){
		if(h1.containsKey(obj)){
			h1.put(obj, h1.get(obj));
		}
		else{
		h1.put(obj, 1);
	}
	}
	       Set<Character>s1=h1.keySet();
	       for(Character vc:s1){
	    	   if(h1.get(vc)>1){
	    		   System.out.println(vc +"----"+h1.get(vc));
	    	   }
	       }
	
	
}
	
	public static void main(String[] args) {
		duplicateCharInString nc = new duplicateCharInString();
		nc.duplicatecount("Java2invoice");

	}

}
