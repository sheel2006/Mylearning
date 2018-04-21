package CollectionPractic;

import java.util.Comparator;

public class SortingByComparatorEmpid implements Comparator<emp>{

	@Override
	public int compare(emp em1, emp em2) {
	 
		if(em1.empid==em2.empid){
			return 0;
		}
		if(em1.empid>em2.empid){
			return 1;
		}
		if(em1.empid<em2.empid){
			return -1;
		}
		return 0;
	}

}
