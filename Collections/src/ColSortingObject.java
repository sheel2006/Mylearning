import java.util.*;



public class ColSortingObject{
//we are performing soring base on employee id
	public static void main(String[] args) {
		ArrayList<Employee>ls = new ArrayList<Employee>();
		ls.add(new Employee(213,"TestB"));
		ls.add(new Employee(212,"TestD"));
		ls.add(new Employee(211,"TestA"));
		ls.add(new Employee(210,"TestC"));
		Collections.sort(ls);
		for(Employee em:ls){
			System.out.println(em.empid+"------"+em.ename);		}	}}
