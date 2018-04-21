
public class NestIntClass1 implements NestedIntEx1.it2 {

	public void m1() {
		System.out.println("Nested Interface");
		
	}
public static void main(String[] args) {
	NestIntClass1 ns = new NestIntClass1();
	ns.m1();
}
}
