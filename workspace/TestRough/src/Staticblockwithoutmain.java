import java.util.Arrays;
import java.util.HashSet;


class Staticblockwithoutmain {

	public static void main(String[] args){
		//Reveserv string
		String str = "MyJava";
		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--)
		{
		    System.out.println(strArray[i]);     //Output : avaJyM
		}
		
		String st1 = "  Core Java jsp servlets jdbc struts hibernate spring  ";
		String strWithoutSpace = st1.replaceAll("\\s", "");
	//	\\s+ --matches single whitespace character 
	//	\\s -- matches sequence of one or more whitespace characters
       System.out.println(strWithoutSpace); 
       
      // Write a java program to find common elements between two arrays?
       
       String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
       String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
       HashSet<String> set = new HashSet<String>();
       for (int i = 0; i < s1.length; i++)
       {
           for (int j = 0; j < s2.length; j++)
           {
               if(s1[i].equals(s2[j]))
               {
                   set.add(s1[i]);
               }
           }
       }
       System.out.println(set);
       // Write a java program to find common elements between two arrays?
       Integer[] i1 = {1, 2, 3, 4, 5, 4};
       Integer[] i2 = {3, 4, 5, 6, 7, 4};
       HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
       HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
       set1.retainAll(set2);
       System.out.println(set1); 


		
		
	}
}


