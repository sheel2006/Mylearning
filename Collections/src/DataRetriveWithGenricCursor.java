import java.util.ArrayList;
import java.util.Iterator;


public class DataRetriveWithGenricCursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList();
		al.add("EmpA");
		al.add("EmpB");
		al.add("EmpC");
		al.add("EmpD");
		Iterator<String> it = al.iterator();
//Genric version of cursor case the "Type casting" and "type safty" 
System.out.println("Print with Genric ");
while(it.hasNext()){
String itr = it.next();
System.out.println(itr);
	}	
Iterator itr =al.iterator();
System.out.println("Print without Genric ");
while(itr.hasNext()){
	String it1 = (String)itr.next();
	System.out.println(it1);
}

	} }
