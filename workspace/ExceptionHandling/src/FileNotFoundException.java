import java.io.FileInputStream;


public class FileNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
	FileInputStream ft = new FileInputStream("abc.text");
} catch (java.io.FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
