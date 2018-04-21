package Encapculation;

public class Example3 {

	private int empid;
	private String empname;
	
	public void setempid(int empid){
		this.empid=empid;
	}
	public void setempname(String empname){
		this.empname=empname;
	}
	
	public int getempid(){
		return empid;
	}
	public String getempname(){
		return empname;
	}
	
	public static void main(String[] args) {
		Example3 exp = new Example3();
		exp.setempid(10);
		exp.setempname("A");
		System.out.println(exp.getempid());
		System.out.println(exp.getempname());
	}
}
