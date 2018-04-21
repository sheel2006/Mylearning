package StringClassDay1;

public class Example4 {

	int empno;
	String empname;
	Example4(int empno, String empname){
		this.empno=empno;
		this .empname= empname;
	}
	//Method overridding
		public String toString(){// JVM look toString() method in implemented class, 1st priority goes in implemented class 
		return "emp id="+empno+"empname="+empname;
	}
	
	public static void main(String[] args) {
		
		Example4 emp = new Example4(11,"TestA");
		
		System.out.println(emp.empname);
		System.out.println(emp.empname.toString());

	}
// All remember that JVM look toString() method in implemented class, 1st priority goes in implemented class
// if toString() method not present then Object class toString method execcuted and print classname@HashCode
}
