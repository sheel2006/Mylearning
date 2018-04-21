import java.util.ArrayList;
public class CollectionExam2 {
	public static void main(String[] args) {
	  emp e= new emp(11,"TestEmp");
      student st = new student(22,"TestStudent");
      ArrayList al = new ArrayList();
      al.add(e);    // here string class ,"to string" executed. But emp class is not string class so default this class extend to objects class
      al.add(st);   // here string class ,"to string" executed. But emp class is not string class so default this class extend to objects class
      al.add(10);   // here interger object executed with "TO STRING" and it will return contend
      al.add("Selenium");// Here sting class executed with "TO STRING" and it will return contend
      System.out.println(al.toString());
    
      /* Use for each loop
       * syntex of for each loop
       * for("Type of collection data ": " Refernce of collection Name")
       * "Type of collection data":In this case array list contains all kind of data like string, number and object data, 
       * So use Object class to handle all kind of data. Object class contains Student , emp data etc.
       * "Refernce of collection Name" : al
       * */
      
      for(Object obj:al){
    	  if( obj instanceof emp){// To check the type of object, here we are check "obj" contains emp object or not
    		  
    		  emp em = (emp)obj;//Type cast of emp
    		  System.out.println(em.empid+"-------"+em.ename);
    		  
    	  }
    	  if( obj instanceof student){
    		  student stu =(student)obj;
    		  System.out.println(stu.sname+"-------"+stu.stuid);
    	  }
    	  if(obj instanceof Integer){
    		  System.out.println(obj);
    	  }
    	  if(obj instanceof String){
    		  System.out.println(obj);
    	  }
      /* suppose we have 100+ different object we cant check every time inatanceof and type casting and we have use 100+ if loops
       * This is not effective way to handle it*/
      }
      }
      
	}


