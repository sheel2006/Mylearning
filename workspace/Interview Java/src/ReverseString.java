
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Be in present hello";
	    char[] temparray= input.toCharArray();
	    for(int i =temparray.length-1;i>=0;i--){
	    	System.out.print(temparray[i]);
	    	input.toCharArray()
	    }
	}

}
