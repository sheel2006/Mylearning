package test.encapsulation;

public class School extends Institution{
	/* School is a Institution, is mean inheritance relationsship
	 * School has a Room-- encapculation
	 */
	Room r= null;// Object of Room class
	
	public School(Room r){
		this.r=r;
		System.out.println();
		
	}
	
	
}
