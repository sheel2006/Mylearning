package StringClassDay1;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1 = "Hello";
     String s2 = "Hello";
     String s3 = "World";
     System.out.println(s1);
     /* 1. For string object will be create in SCP (string content pool)memory area.
      * 2. JVM always checking in momery that if any privous object avilable with same content or not, 
      * if it avilable jvm not create object for s2 refernce varaible and s2 will be point to same object of s1 reference variable. 
      * 3. SCP memory not allowed duplicate object creation
      * 
      * "==" always compair the refernce varaible, if two refence variable point same object then it return true value
      * for example : s1==s2  return true
      * s1==s3 return false
      * s2==s3 return false
      */
     System.out.println(s1==s2);
System.out.println(   s1.concat(s2));
System.out.println(s1.concat(" Test"));
     
     String s5 = new String("World");
     System.out.println(s3);
     String s4 = new String("World");
     String s6 = new String ("Google");
     /* 1. for string object create with new keyword then object created in heap memory area
      * 2. Here JVM never check prvious object and contains, its create object for reference variable s3 and s4
      * 3. Heap memory not allowed duplicate object creation
      * 4.  s4==s5 always return false
      * 	s6==s5 always return false
      * here refence variable point to different object.
      * 
      */
     System.out.println(s4==s5);
     System.out.println(s5.concat("..."));
	}

}
