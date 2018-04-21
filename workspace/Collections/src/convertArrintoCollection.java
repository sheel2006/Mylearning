import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
public class convertArrintoCollection {
	public static void main(String[] args) {
	System.out.println("This will convert Array to collection");
		String arr[] ={"EmpA","EmpB","EmpC","EmpD","EmpE"};
      ArrayList<String>al = new ArrayList<String>(Arrays.asList(arr));
    for(String st:al){
    	System.out.println(st);
    }
     
    System.out.println("This will convert Normal collection to Array # Method1 ");	
    ArrayList at = new ArrayList();
        at.add(101);
        at.add("EmpA");
        at.add(10.50);
        at.add(true);	
    
        Object[] obj1 = at.toArray();
        for(Object ob:obj1){
        	System.out.println(ob);
        	
        }
        System.out.println("This will convert Genreric collection to Array # Method2");	   
        ArrayList<String>ls = new ArrayList<String>();
        ls.add("xxx");
        ls.add("yyy");
        ls.add("zzz");
        String[] str = new String[ls.size()];
        ls.toArray(str);
        for(String e:ls){
        	System.out.println(e);
        }
	}
	} 

