
public class largestandsmallernumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{11, 23, 47, 5, 92, 52, 48, 56, 66, 65};
		int smallest = arr[0];
		int highest =arr[0];
		for(int i =0;i<arr.length;i++){
			if(arr[i]>highest){
				highest=arr[i];
			}
			else if(arr[i]<smallest){
				smallest=arr[i];
			}
		}
		System.out.println("the smallest number in the array is:" + smallest);
		System.out.println("the largest number in the array is:" + highest);

	}

}
