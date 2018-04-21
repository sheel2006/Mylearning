package Encapculation;



public class Example2 {

private int empid;
private String empname;


public void setempid(int empid){
	this.empid=empid;
}
public void setename(String ename){
	this.empname= ename;
}
public int getempid( ){
	return empid;
}
public String getename(){
	return empname;
}
	public static void main(String[] args) {
		Example2 em = new Example2();
		em.setempid(10);
		em.setename("Test");
		
		System.out.println(em.getempid());
		System.out.println(em.getename());
		
	}
}
