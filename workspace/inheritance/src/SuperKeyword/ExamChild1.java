package SuperKeyword;

public class ExamChild1 extends ExamParent1 {
 int a = 100;
 int b = 200;
	
  void m1(){
	  int a = 20;
	  int b = 10;
	  System.out.println("value of local variable "+(a+b));
	  System.out.println("value of this variable "+(this.a+this.b));
	  System.out.println("value of super variable "+(super.a+super.b));
	  this.m2();
  }
  void m2(){
	  super.m1();
  }
  
	
	public static void main(String[] args) {
	//	ExamParent1 ep = new ExamParent1();
		ExamParent1  ec = new ExamChild1();
		//ep.m1();
		ec.m1();
		

	}

}
