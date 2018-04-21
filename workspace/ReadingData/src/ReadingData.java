
public class ReadingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader xls = new Xls_Reader("D:\\DataSheet.xlsx");
		int column= xls.getColumnCount("Login");
		int rows = xls.getRowCount("Login");
		System.out.println(rows);

	}

}
