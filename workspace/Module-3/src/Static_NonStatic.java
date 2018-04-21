
public class Static_NonStatic {

	int x = 100; //Non-Global variable--used across all these function
	static int age =10; // static  Global variable--used across all these function
	
	//static function only access static stuff
	
	public static void main(String[] args) {
		//main is static function 

//here we can call sum function but non static function not allowed here 
// only access static global variable, note that non static global value not allowed here	
		sum();
		age =100;//static global variable
		
// Note that no static variable or Non static function called 		
	}
 
	public static void sum(){//Static function
	 int i = 100 ; //local variable inside in function 
	 
 }
  
	public void sendmail(){//Non Static function
		int i = 100 ; //local variable inside in function  
// Here we can call or use static function and 	variable ..Java allowed it
	
		sum();//static global function
		age =100;//static global variable
		
		
 }
}
