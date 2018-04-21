import java.util.ArrayList;


public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList al = new ArrayList();
     al.add("Apple");
     al.add("Mango");
     al.add("Cherry");
     al.add("Grapes");
     System.out.println("Array list "+al);
     al.add(2, "Blueberry");
     System.out.println("Array list "+al); 
     al.remove(2);
     System.out.println("Array list "+al); 
     System.out.println(al.contains("Apple"));
     System.out.println(al.get(1));
     
	}

}
