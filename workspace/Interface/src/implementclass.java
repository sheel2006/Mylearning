//Example #1
public class implementclass implements InterE1 {

	public void m1(){
		System.out.println("Print M1");
	}
	public void m2(){
		System.out.println("Print M2");
	}
	public void m3(){
		System.out.println("Print M3");
	}
	public static void main(String[] args) {
		implementclass  ic = new implementclass();
		ic.m1();ic.m2();ic.m3();
		
		InterE1 it = new implementclass();
		it.m1();it.m2();it.m3();
	}
		

	}
	

