import java.util.Arrays;


public class DeleteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// internalize the array
		int arg[] = { 5, 6, 8, 9, 10 ,11,12};
		// Delete the Array Element position
		int pos = 2;
		// Before Delete Array Output
		for (int k = 0; k < arg.length; k++) {
		System.out.println(arg[k]);
		}
		
		for (int i = 0; i < arg.length; i++) {
		// Delete Function
		if (pos == i) {
		for (int j = i + 1; i < arg.length - 1; j++) {
		arg[i] = arg[j];
		i++;
		}
		}
		}
		// After delete the array element Output
		System.out.println("The output of Array After Delete");
		for (int i = 0; i < arg.length - 1; i++) {
		System.out.println(arg[i]);
		}
		//arg = Arrays.removeElement(arg, element)
		}
		}
