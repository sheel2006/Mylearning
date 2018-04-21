package CollectionPrac;

import java.util.ArrayList;

public class ConversationInArray {

	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		ls.add(10);
		ls.add("Test");
		ls.add("C");
		Object [] obj = ls.toArray();
		for(Object ob:obj){
			System.out.println(ob);
			
		}
	}

}
