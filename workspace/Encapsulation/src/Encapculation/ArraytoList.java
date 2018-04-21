package Encapculation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]={10,10,20,30,40,40	};
 ArrayList<Integer>ls = new ArrayList<Integer>();
 for(int i =0;i<arr.length;i++){
	 ls.add(arr[i]);
 }
System.out.println(ls);

HashSet<Integer>hs = new HashSet<Integer>(ls);
System.out.println(hs);
	 
 
 
 
	}

}
