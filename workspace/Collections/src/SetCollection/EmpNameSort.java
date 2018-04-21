package SetCollection;

import java.util.Comparator;

public class EmpNameSort implements Comparator<emp>  {
	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		return (o1.ename).compareTo(o2.ename);	}}
