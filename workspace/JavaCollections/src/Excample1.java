import java.util.ArrayList;


public class Excample1 {
	public static void main(String[] args) {
     employee emp = new employee(10,"TestEmployee");
     Student  stu = new Student(20,"TestStudent");
	 ArrayList al = new ArrayList();
	 al.add(emp);
	 al.add(stu);
	 al.add("10");
     System.out.println(al.toString());
     for(Object o:al){
    	 if(o instanceof employee){
    		 employee e = (employee)o;
    	 }
    	 
     }
	}

}
