package inheritance;

public class ChildClassConstrutor extends ParentClsConstrutor{
   int a =10;
	ChildClassConstrutor(){
		//super();
		this(10);
		super();
		System.out.println("Child Class Construtor");	}
	ChildClassConstrutor(int i){
					System.out.println("Child Class Construtor"+i);	}
		public static void main(String[] args) {
			new ChildClassConstrutor();	
				}}
