import java.util.ArrayList;
import java.util.Iterator;


public class DataRetriveWithNormalCursor {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("EmpA");
		al.add("EmpB");
		al.add("EmpC");
		al.add("EmpD");
		Iterator it = al.iterator();
//Normal version of cursor without genric, in normal cursor Type casting and type safty used. 
while(it.hasNext()){/* Rememder that it.next return data in Object Format but here 
			                   we are try String data so we use type cast */
String itr = (String)it.next();//Type Casting is use here..
System.out.println(itr);
	}	}}
