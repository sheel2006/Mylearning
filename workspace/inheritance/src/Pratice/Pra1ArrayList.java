package Pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Pra1ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>al = new ArrayList<String>();
		al.add("TestA");
	  //	al.add("TestB");
    	//  al.add("TestC");
	/*	
		Iterator at=al.iterator();
		while(at.hasNext()){
			System.out.println(at.next());
		}
		System.out.println("------");
		for(String e: al){
			System.out.println(e);
		}
		
		Collections.swap(al, 1, 2);
		System.out.println(al);*/
		Collections.reverse(al);
		System.out.println(al);
		
		StringBuffer bt = new StringBuffer("TestA");
		bt.reverse();
		System.out.println(bt);
	}

}
