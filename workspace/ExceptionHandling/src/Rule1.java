
public class Rule1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			//System.out.println("Hello world");
		    System.out.println("Out of Number"+10/0);
			System.out.println("Hello world java");
		}
		catch(NullPointerException|ClassCastException |ArithmeticException  e){
			System.out.println("Out of Number"+10/0);
		}
		finally{
			System.out.println("Out of Number"+10/0);
		}
		
		
		
	}

}
