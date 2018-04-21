import java.util.LinkedList;


public class LinkListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ls = new LinkedList();
		ls.add("America");
		ls.add("India");
		ls.add("Isreal");
		ls.add("Nepal");
		ls.add("Japan");
		System.out.println("display element "+ls);
		ls.addFirst("Help");
		System.out.println("display element "+ls);
		ls.addLast("Lastelement");
		System.out.println("display element "+ls);
		System.out.println("display last "+ls.getLast());
		System.out.println("Display first "+ls.getFirst());
		ls.add(1, "Jamaica");
		System.out.println("display element "+ls);
		System.out.println("display size of linkedlist  "+ls.size());
	}

}
