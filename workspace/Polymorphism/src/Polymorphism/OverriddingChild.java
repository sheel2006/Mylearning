package Polymorphism;

public class OverriddingChild extends OverriddingParent{
	
	void m1(){
		final int a =10;
		System.out.println("Value of a"+ a);
	//	a= a+10;/ final value never be changed other compiler will be give error
	//	System.out.println("Value of a"+ a);
		System.out.println("Child method in m1 rule 1st");
	}
	int m2(){
		System.out.println("Child method m2 have to same method return type on primitive level rule no 2.. Like int is return type@primitive level ");
		System.out.println("if method is final then overriding will be fail");
		return 1;
	}

	public static void main(String[] args) {
		OverriddingParent op = new OverriddingParent();
		OverriddingParent oc = new OverriddingChild();
		op.m1();
		oc.m1();
		oc.m2();
	}
}
