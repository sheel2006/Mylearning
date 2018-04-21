package test.encapsulation;

public class test {
public static void main(String[] args) {
	
	
	Room r = new Room();
	r.space=100;
	School s = new School(r);
	s.teach();
	System.out.println(s.r.getspace());
}
}
