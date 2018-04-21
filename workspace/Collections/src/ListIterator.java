import java.util.*;
 

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList();
		al.add("EmpA");
		al.add("EmpB");
		al.add("EmpC");
		al.add("EmpD");
	    java.util.ListIterator<String> itr=al.listIterator();
	  //  itr.remove();
	    System.out.println("Print in backword direction with generic ");
	    System.out.println("  ");
	    while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	    System.out.println("Print in forword direction  with generic");
	    while(itr.hasNext()){
	    	System.out.println(itr.next());// Type cast not needed coz we are using Genric
	    }
		System.out.println("Print in backword direction  with generic");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}	}}
