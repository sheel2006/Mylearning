import java.util.ArrayList;
import java.util.Collections;


public class CollectionSortSimple {

	public static void main(String[] args) {
   ArrayList<String>al = new ArrayList<String>();
   al.add("EmpA");
   al.add("TestA");
   al.add("Apple");
   al.add("Banana");
   System.out.println("Before Storing of Data " +al);
   Collections.sort(al);
   System.out.println("After Storting of data "+al);
	}}
