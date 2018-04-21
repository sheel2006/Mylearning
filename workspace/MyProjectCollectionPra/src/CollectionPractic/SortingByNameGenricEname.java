package CollectionPractic;

import java.util.Comparator;

public class SortingByNameGenricEname implements Comparator<emp> {

	@Override
	public int compare(emp obj1, emp obj2) {
		return (obj1.empname).compareTo(obj2.empname);
	}
}
