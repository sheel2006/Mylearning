package practice;

public class CharCount {

	public static void main(String[] args) {
		int vowels=0,digit=0,space=0;
		String str = "Hello 222Java";
		for(int i =0;i<str.length();i++){
			char ch=str.charAt(i);
			digit++;
			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
					ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
						vowels ++;
					else if(Character.isDigit(ch))
						digit ++;
					else if(Character.isWhitespace(ch))
						space ++;	
		}
		System.out.println("Vowels : " + vowels);
		System.out.println("Digits : " + digit);
		System.out.println("Blanks : " + space);

	}
}
