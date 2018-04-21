package practice;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<emp>al = new ArrayList<emp>();
		al.add(new emp(20,"empA"));
		al.add(new emp(10,"empB"));
		Collections.sort(al,new empComp());
		for(emp e:al){
			System.out.println(e.empid+"--"+e.ename);
		}
		
	}

}
