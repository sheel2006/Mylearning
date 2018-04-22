
public class Employee implements Comparable<Employee>
{
    int empid ;
    String ename;
    Employee(int eid, String ename){
    	this.empid=eid;
    	this.ename=ename;
    }
	
	public int compareTo(Employee em) {
		if(empid==em.empid){
			return 0;/* This method compare unique code of 1st digit of empid so
			            if return 0 that mean no changes.if return 1 then change the 
			            postition of empid and return -1 mean no changes in empid during sorting*/
		}
		if(empid>em.empid){
			return 1;
		}
		if(empid<em.empid){
			return -1;
		}
		return 0;
		
	}
  	/* Sorting is perform by Employee data 
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return ename.compareTo(o.ename);
	}
*/
}
