
public class Block {

	int a = 10 ;//Inatance variable
	static int b =20;//static vaiable
	
	void m1(){
		System.out.println("Instance Method");//4
	}
	static void m2(){
		System.out.println("Static Method");//7
	}
	static{
		System.out.println("Static block");//1
	}
	{
		System.out.println("Inatance Block");//2,5
	}
	Block(){
		System.out.println("Construtor without parameter");//3
	}
	Block(int a){
		System.out.println("Construtor with parameter");//6
	}
  public static void main(String[] args) {
	
	  Block B1= new Block();
	  Block B2= new Block(10);
	  B1.m1();
	  Block.m2();
}
}
