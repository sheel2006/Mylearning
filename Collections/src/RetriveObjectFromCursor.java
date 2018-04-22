import java.util.ArrayList;


public class RetriveObjectFromCursor {

	public static void main(String[] args) {
	   emp em1 = new emp(10, "EmpA");
       emp em2 = new emp(20, "EmpB");
       emp em3 = new emp(30, "EmpC");
       emp em4 = new emp(40, "EmpD");
       emp em5 = new emp(50, "EmpE");
       ArrayList<emp> al = new ArrayList<emp>();
       al.add(em1);
       al.add(em2);
       al.add(em3);
       java.util.ListIterator<emp> itr=al.listIterator();
       itr.add(em4);// Add object by ListIterator this record will be add to 1st postion becuase ListIterator point to 1st position in memory
       while(itr.hasNext()){
    	   emp e = itr.next();// listIterator will return emp data object
    	   System.out.println(e.empid+"-----"+e.ename);   
    	   if((e.ename).equals("EmpB")){
    		   itr.set(em5);;
    	   }
    		   
       }
       System.out.println("For each Loop");
      for(emp em:al){
    	  System.out.println(em.empid+"----"+em.ename);    } 
      }}
