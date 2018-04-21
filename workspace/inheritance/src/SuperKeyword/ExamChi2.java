package SuperKeyword;

public class ExamChi2  extends ExamPar2{

	ExamChi2(){
		//this(10);
		System.out.println("Child Class Construtor");
		
	}
	ExamChi2(int i ){
		//super();
		//super(10);
		System.out.println("Child Class Construtor"+ i);
		
	}
	public static void main(String[] args) {
		new ExamChi2();
		new ExamChi2(10);
		
	}
}
