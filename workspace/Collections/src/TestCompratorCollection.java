import java.util.ArrayList;
import java.util.Collections;


public class TestCompratorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<emp>ls= new ArrayList<emp>();
    ls.add(new emp(12,"EmpD"));
    ls.add(new emp(11,"EmpA"));
    ls.add(new emp(10,"EmpB"));
    ls.add(new emp(13,"EmpA"));
    System.out.println("Sorting by Employee id");
    Collections.sort(ls,new EmpidComp());
    for(emp e :ls){
    	System.out.println(e.empid+"-----"+e.ename);    }
    System.out.println("                        ");
    System.out.println("Sorting by Employee name");
    Collections.sort(ls,new EmpnameComp());
    for(emp e :ls){
    	System.out.println(e.empid+"-----"+e.ename);  }   }}
