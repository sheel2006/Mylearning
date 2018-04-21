package abstraction;

public abstract class ChildEx6  extends ParentEx6{
 void m1(){	 System.out.println("m1 method implements in child class"); }

 abstract void m2();
 
 /* note that m2 is not abstract in ParentEx6, now we are making m2 as abstract method in ChildEx6
  * so childEx6 will be abstract clas*/
	
}
