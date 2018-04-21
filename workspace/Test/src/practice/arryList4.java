package practice;

import java.util.ArrayList;

public class arryList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<emp>al = new ArrayList<emp>();
al.add(new emp(10,"empA"));
al.add(new emp(20,"empB"));
ArrayList<emp>st= new ArrayList<emp>();
st.addAll(al);
st.add(new emp(30,"empc"));
st.add(new emp(40,"empD"));
//st.removeAll(al);
System.out.println(st.containsAll(al));

System.out.println(st.retainAll(al));
for(emp e:st){
System.out.println(e.empid+"--"+e.ename);
}



	}
}
