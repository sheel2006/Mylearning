package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello Java with World";
		StringBuilder RevString = new StringBuilder();
		RevString.append(str);
		RevString = RevString.reverse();
		for(int i =0;i<RevString.length();i++){
			System.out.print(RevString.charAt(i));
		}
		
		
	}

}
