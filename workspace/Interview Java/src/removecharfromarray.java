import java.util.ArrayList;
import java.util.List;

public class removecharfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrlist = new ArrayList(6);
		// add elements using add method
		arrlist.add("a");
		arrlist.add("b");
		arrlist.add("e");
		arrlist.add("c");
		arrlist.add("d");
		arrlist.add("e");
		// size of arraylist
		System.out.println("size of the list is:" + arrlist.size());
		for (String strng : arrlist) {
		System.out.println("String is:" + strng);
		}
		// remove first occurrence of e
		arrlist.remove("e");
		System.out.println("new array list size is:" + arrlist.size());
		for (String strng : arrlist) {
		// print new arraylist
		// System.out.println("size of new arraylist:" +arrlist.size());
		System.out.println("String=" + strng);
		}

	}

}
