package SetCollections;

import java.util.TreeSet;

public class StringBufferSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet st = new TreeSet(new StringBufferComparator());
		st.add(new StringBuffer("EmpA"));
		st.add(new StringBuffer("EmpD"));
		st.add(new StringBuffer("EmpC"));
		st.add("EmpB");
		st.add("EmpE");		
		System.out.println(st);	}}
