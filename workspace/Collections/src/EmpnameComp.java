import java.util.Comparator;


@SuppressWarnings("rawtypes")
public class EmpnameComp implements Comparator<emp> {
	public int compare(emp e1, emp e2) {
		return (e1.ename).compareTo(e2.ename);	}}
