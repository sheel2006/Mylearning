package inheritance;

public class InstanceBlockChild extends instanceBlockPar {
	{
		System.out.println("Child Instance Block");
	}
	InstanceBlockChild(){
		super();// by default compiler will be created
		System.out.println("Child Construtor executed");
	}
	
	public static void main(String[] args) {
		new InstanceBlockChild();	}}
