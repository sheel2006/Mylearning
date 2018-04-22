import java.util.Comparator;


public class EmpidComp implements Comparator<emp> {
	public int compare(emp e1, emp e2) {
	    if(e1.empid==e2.empid){
		   return 0;	   }
	   if(e1.empid>e2.empid){
		   return 1;	   }
	   if(e1.empid<e2.empid){
		   return-1;	  }
	return 0;}}
