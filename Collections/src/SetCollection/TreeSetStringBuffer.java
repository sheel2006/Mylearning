package SetCollection;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetStringBuffer {

	public static void main(String[] args) {
	   	TreeSet ts= new TreeSet(new TreeSetStringBufferSorts());
		ts.add(new StringBuffer("EmpB"));
		ts.add(new StringBuffer("EmpA"));
		ts.add(new StringBuffer("EmpC"));
		ts.add(new StringBuffer("EmpD"));
		System.out.println(ts);			}}
