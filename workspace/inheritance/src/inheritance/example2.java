package inheritance;

public class example2 extends example {
	static int i  =20 ;
	int j = 30;
	
	public static void main(String[] args) {
		example2 e = new example2();
		System.out.println(e.j);
		System.out.println(e.i);
		e.m1();
	}
	public void m1(){
		int i = 20;
		int j = 10;
		System.out.println(example2.i);
		System.out.println(i+j);
		System.out.println(this.i+this.j);
		System.out.println(super.i+super.j);
		
	}

}
