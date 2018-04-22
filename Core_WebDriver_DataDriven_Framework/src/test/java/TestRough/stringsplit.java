package TestRough;

public class stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String test1 = "Reliance Growth Fund ..  (-11.08%)";
  String temp[]= test1.split("\\(");
  //split method give string array in returned
  System.out.println(temp[0].split("\\.")[0]);
  System.out.println(temp[1].split("\\)")[0]);
  
	}

}
