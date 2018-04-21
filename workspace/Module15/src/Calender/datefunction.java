package Calender;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class datefunction {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
      String date = "15/03/2015";
    		  SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    		  Date d = df.parse(date);// convert string in Date data type
    		 
    		  String month = new SimpleDateFormat("MMM").format(d);
    		  String year =  new SimpleDateFormat("yyyy").format(d);
    		  
    		  System.out.println(month);
    		  System.out.println(year);
    		  
    		  Date currentdate = new Date();
    		  System.out.println(currentdate);
	}

}
