package Encapculation;

public class Example1 {
private int eid;
private String ename;

//Setter method always use void used to set various properties
public void setstudent(int empid){
	 this.eid=empid;
}
public void setstudentname(String empname){
	this.ename= empname;
	}

// Getter method get the value from property
public int getStudentid(){
	return eid;
	
}

public String getStudenname(){
	return ename;
	
}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Example1 em = new Example1();
	em.setstudent(10);
	em.setstudentname("Sre");
	
	int i  = em.getStudentid();
	String j = em.getStudenname();
	
	System.out.println(i);
	System.out.println(j);

	}

}
