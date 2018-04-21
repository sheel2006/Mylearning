package inheritance;

public class StaticBlockChild extends StaticBlockPar {
static{	System.out.println("Child Static Block");}
      {	System.out.println("Child instance Block");}
      StaticBlockChild(){System.out.println("Child Constructor executed");	  }
public static void main(String[] args) {
	new StaticBlockChild();}}


/*Parent Static block
Child Static Block
Parent instance block
Parent constructor
Child instance Block
Child Constructor executed*/
