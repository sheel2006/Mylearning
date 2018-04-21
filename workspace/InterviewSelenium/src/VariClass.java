
public class VariClass {
	protected String str ="xyz";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Check whether string is palindrome or not 		
	String str = "Madam";
	String str1="";
	for(int i =str.length()-1;i>=0;i--){
		str1= str1+str.charAt(i);
	}
	System.out.println(str1);
	if(str.equalsIgnoreCase(str1))
		System.out.println("True");
	else
		System.out.println("false");

	}

}
