package StringClassDay1;

public class Example6 {

	
	Example6(String str){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example6 ex1 = new Example6("Test");
		Example6 ex2 = new Example6("Test");
		System.out.println(ex1.equals(ex2));
		
		String sr1 = "Test";
		String sr2 = "Test";
		
		System.out.println(sr1.equals(sr2));
		
		StringBuffer sb1 = new StringBuffer("Test");
		StringBuffer sb2 = new StringBuffer("Test");
     System.out.println(sb1.equals(sb2));
	}

}
