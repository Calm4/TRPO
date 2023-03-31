package MainPackage;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
		RadixSort.radixSort(arr);
		System.out.println(Arrays.toString(arr)); // [2, 24, 45, 66, 75, 90, 170, 802]

	}

}
