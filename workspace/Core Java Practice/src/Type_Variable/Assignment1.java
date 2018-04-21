package Type_Variable;

public class Assignment1 {
	int a=10;
	static int b=20;
	public static void main(String[] args) {
		 
		Assignment1 as1 = new Assignment1();
		System.out.println(as1.a);
		System.out.println(as1.b);
		System.out.println("-------------");
		as1.a=30;
		as1.b=40;
		System.out.println(as1.a);
		System.out.println(as1.b);
		System.out.println("-------------");
		Assignment1 as2 = new Assignment1();
		System.out.println(as2.a);
		System.out.println(as2.b);
		System.out.println("-------------");
		Assignment1 as3 = new Assignment1();
		System.out.println(as3.a);
		System.out.println(as3.b);
}

}
