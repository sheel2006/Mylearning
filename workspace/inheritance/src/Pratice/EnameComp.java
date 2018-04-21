package Pratice;

import java.util.Comparator;

public class EnameComp implements Comparator<emp>{

	@Override
	public int compare(emp e1, emp e2) {
		
		return (e1.ename).compareTo(e2.ename);
	}

}
