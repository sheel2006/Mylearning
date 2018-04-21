
public class SecondHighestinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[]{1, 23, 47, 81, 92, 52, 48, 56, 66, 65};
		int largest = arr[0];
		int secondlarget =arr[0];
		for(int i =0;i<arr.length;i++){
			if(arr[i]>largest){
				secondlarget= largest;
				largest= arr[i];
		
			}
			else if (arr[i] > secondlarget) {
				secondlarget = arr[i];

		}
	}
		System.out.println("second largest number is:" + secondlarget);
}
}