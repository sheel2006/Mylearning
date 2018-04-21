import java.util.Date;


public class DateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	Date d = new Date();
	String currentdate =  d.toString();
	System.out.println(currentdate.replace(":", "_"));
	}

}
