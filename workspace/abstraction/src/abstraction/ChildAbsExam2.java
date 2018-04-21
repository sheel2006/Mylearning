package abstraction;

public class ChildAbsExam2 extends ParentAbsExam2 {

	void m1(){
		System.out.println("Parent class M1");
	}
	void m2(){
		System.out.println("Parent Class M2");
	}
	public static void main(String[] args) {
		ChildAbsExam2 ch = new ChildAbsExam2();
		ch.m1();
		ch.m2();
		ch.m3();
	}
	//Its madatory that parent class all abstract method should be define in child class. 
	//In case if any of parent class method not define in child class then child call become abstract class.
	// Providing implemention of parent class method known as overridding.
}
