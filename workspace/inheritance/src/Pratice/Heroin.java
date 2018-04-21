package Pratice;

public class Heroin {
    String hname;
    int hage;
    Address add;
    
    Heroin(String hname,int hage, Address add){
    	this.hname =hname;
    	this.hage=hage;
    	this.add=add;
    }
    void displays(){
    	System.out.println("Hname   "+hname);
    	System.out.println("Hage    "+hage);
    	System.out.println("Address   "+add.country+"   "+add.dno+"    "+add.State);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Address a1 = new Address(22,"India","Delhi");
    Heroin h1 = new Heroin("TestA",22,a1);
    h1.displays();
	}

}
