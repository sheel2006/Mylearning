package practice;

import java.util.Comparator;

public class empComp implements Comparator<emp>{

	@Override
	public int compare(emp e1, emp e2) {
		if(e1.empid==e2.empid){
			return 0;
		}
		else if 
		(e1.empid>e2.empid)
		{	return 1;
		}
		else{
			return -1;
		}
	}

}
