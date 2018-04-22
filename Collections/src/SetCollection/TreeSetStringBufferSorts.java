package SetCollection;

import java.util.Comparator;

public class TreeSetStringBufferSorts implements Comparator<StringBuffer> {
	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		// TODO Auto-generated method stub
		return (o1.toString()).compareTo(o2.toString());}}
