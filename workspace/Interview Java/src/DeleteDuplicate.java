
public class DeleteDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arg[]={2,3,2,4,3,6,7,9};
 // int pos =2;
 
  for(int i=0;i<arg.length;i++){
	 for(int k=i+1;k<arg.length;k++){
		 if(arg[i]==arg[k])
			 for(int m =k+1;k<arg.length-1;m++){
				 arg[k]=arg[m];
				 k++;
			 }
			 
	 }
  }
	  
	  
	  
  
  for(int j=0;j<arg.length-1;j++){
	  System.out.println(arg[j]);
  }
  
  
	}

}
