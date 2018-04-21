package Polymorphism;

public class Overloading {

	Overloading(){
		System.out.println("Overloading ");
	}
	Overloading(int i){
		System.out.println("Value of Overloading "+i);
	}
	Overloading(String ename){
		System.out.println("value of ename "+ename);
	}
	int m1(){
		System.out.println("m1 from default");
		return 1;
	}
	
	String m1(int i){
		System.out.println( "value of "+ i);
		return null;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Overloading();
        new Overloading(10);
        new Overloading("Test");
       
        Overloading  ov = new Overloading();
        ov.m1();
        ov.m1(10);
	}

}
