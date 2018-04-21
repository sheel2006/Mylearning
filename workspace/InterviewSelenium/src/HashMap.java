import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable hm = new Hashtable();
		hm.put("A",1);
		hm.put("B",11);
		hm.put("A",111);
		hm.put("A",1111);
		hm.put("A",11111);
		
		Iterator it = (Iterator) hm.keys();
		while(it.hasNext()){
		System.out.println(it.next());	
		}
		
		
	}

}
