package SingleTonPatter;

public class SinglePattern {
	// 3rd define the object 
	private static SinglePattern Soleinstance = new SinglePattern();
	
	
	//1st Rule make constructor as private so no one create my class object
	private SinglePattern(){
	System.out.println("Creating");	
			
	}
// 2nd rule provide the global access so make static method to get sole instance
	
	public static SinglePattern getInstance(){
		return Soleinstance;
		
	}
	public static void main(String[] args) {
		SinglePattern s1 = SinglePattern.getInstance();
		SinglePattern s2 = SinglePattern.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
