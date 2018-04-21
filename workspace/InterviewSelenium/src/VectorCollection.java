import java.util.Vector;


public class VectorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector vc = new Vector();
		vc.add("AA");
		vc.add("BB");
		vc.add("CC");
		System.out.println("display elements "+vc);
		vc.remove(0);
		System.out.println("display elements "+vc);
		vc.add(0, "AA");
		System.out.println("display elements "+vc);
	}

}
