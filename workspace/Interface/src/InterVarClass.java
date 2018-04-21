
public class InterVarClass implements interfaceVari{

	@Override
	public void m1() {
		interfaceVari.a=interfaceVari.a+10;
		System.out.println("value of a  "+interfaceVari.a);// value of 'a' cannot be changed because interface variable have final
		
	}
	public static void main(String[] args) {
		InterVarClass in = new InterVarClass();
		in.m1();
	}

}
