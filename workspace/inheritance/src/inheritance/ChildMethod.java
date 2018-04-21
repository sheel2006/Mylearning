package inheritance;

public class ChildMethod extends ParentMethod{
	void m1(){
	System.out.println("Child class Method");
	}
	void m2(){
	this.m1();
	super.m1();
	}
	public static void main(String[] args) {
	new ChildMethod().m2();	}}
