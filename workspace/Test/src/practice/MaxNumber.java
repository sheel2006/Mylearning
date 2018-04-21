package practice;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arry = {10,20,30,40,50,50,50,10,20,30,20};
		int maxcount=1;
		int maxnum=arry[0];
		
		for(int i=0; i<=arry.length;i++){
			int count=0;
			for(int j=i+1; j<=arry.length-1;j++){
				if(arry[i]==arry[j]){
					count++;
					
				}
				if(count>maxcount){
					maxcount=count;
					maxnum=arry[i];
				}
				
			}
		}
		System.out.println(maxnum +"------"+maxcount);
			
		 
				
	}

}
