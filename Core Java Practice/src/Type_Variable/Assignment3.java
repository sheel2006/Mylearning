package Type_Variable;

public class Assignment3 {
	int a =10;//instance variable
	static int b=30;

	void m1(){
		System.out.println(a);
		System.out.println(Assignment3.b);	}
	static void m2(){
		Assignment3 t1 = new Assignment3();
		System.out.println(Assignment3.b);
		System.out.println(t1.a);	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3  t1 =new Assignment3();
		/*****************/
    t1.m1();
    m2();   	}}
