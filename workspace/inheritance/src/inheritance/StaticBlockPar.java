package inheritance;

public class StaticBlockPar {
	
	static {System.out.println("Parent Static block");}
	
	{System.out.println("Parent instance block");}
	
	StaticBlockPar(){
		System.out.println("Parent constructor");	}}
