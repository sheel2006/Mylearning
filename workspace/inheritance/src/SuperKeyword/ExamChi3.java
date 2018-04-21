package SuperKeyword;

public class ExamChi3 extends ExamPar3{

	{
		System.out.println("Instance Block from child");
	}
	
	ExamChi3(){
		System.out.println(" Construtor in child ");
	}
	ExamChi3(int i){
		System.out.println(" Construtor in child "+ i);
	}
	static{
		System.out.println("Static block in Child Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExamChi3();
		new ExamChi3(10);
	}

}
