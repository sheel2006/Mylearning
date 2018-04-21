package Exception;

public class ExceptionDemo {

	public static void main(String[] args)throws CustomException {
		ExceptionDemo ed = new ExceptionDemo();
		for(int i=0;i<5;i++){
			System.out.println(i);
			if(i==3){
				throw new CustomException("exception raise");
}
		}
	}
}


