package Pratice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RevereString {

	public static void main(String[] args) {
		String test = "Hello World Java";
				System.out.println(test.replace("World", ""));
				
				String[] str = {"Hello","Java","World","Java"};
				int[] num={10,10,20,30,50,70};
				LinkedList<Integer>ln = new LinkedList<Integer>();
				for(int i = 0;i<num.length;i++){
					ln.add(num[i]);
				}
				System.out.println(ln);
				HashSet<Integer>hn = new HashSet<Integer>(ln);
				System.out.println(ln);
				
				
				LinkedList<String>ls = new LinkedList<String>(Arrays.asList(str));
				System.out.println(ls);
				HashSet<String>hs = new HashSet<String>(ls);
				System.out.println(hs);
				LinkedHashSet<String>hm = new LinkedHashSet<String>(ls);
				System.out.println(hm);
	
	}
	
	
    
}
