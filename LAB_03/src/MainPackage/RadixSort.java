package MainPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;


public class RadixSort {
	
	public static void radixSort(int[] input) {
	    // separate negative and non-negative numbers
	    List<Integer> negativeNumbers = new ArrayList<>();
	    List<Integer> nonNegativeNumbers = new ArrayList<>();
	    for (int i : input) {
	        if (i < 0) {
	            negativeNumbers.add(i);
	        } else {
	            nonNegativeNumbers.add(i);
	        }
	    }

	    // sort negative numbers in ascending order
	    if (!negativeNumbers.isEmpty()) {
	        int[] negativeArray = new int[negativeNumbers.size()];
	        for (int i = 0; i < negativeArray.length; i++) {
	            negativeArray[i] = negativeNumbers.get(i);
	        }
	        Integer[] boxedArr = Arrays.stream(negativeArray).boxed().toArray(Integer[]::new);
	        Arrays.sort(boxedArr, Comparator.reverseOrder());
	        negativeArray = Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();
	        
	        for (int i = 0; i < negativeArray.length / 2; i++) {
	            int temp = negativeArray[i];
	            negativeArray[i] = negativeArray[negativeArray.length - i - 1];
	            negativeArray[negativeArray.length - i - 1] = temp;
	        }
	        negativeNumbers.clear();
	        for (int i : negativeArray) {
	            negativeNumbers.add(i);
	        }
	    }

	    // sort non-negative numbers in ascending order using radix sort
	    List<Integer>[] buckets = new ArrayList[10];
	    for (int i = 0; i < buckets.length; i++) {
	        buckets[i] = new ArrayList<Integer>();
	    }
	    int divisor = 1;
	    boolean flag = false;
	    while (!flag) {
	        flag = true;
	        for (int i : nonNegativeNumbers) {
	            int digit = (i / divisor) % 10;
	            buckets[digit].add(i);
	            if (flag && digit > 0) {
	                flag = false;
	            }
	        }
	        int index = 0;
	        for (List<Integer> bucket : buckets) {
	            for (int i : bucket) {
	                nonNegativeNumbers.set(index++, i);
	            }
	            bucket.clear();
	        }
	        divisor *= 10;
	    }

	    // combine negative and non-negative numbers into one sorted array
	    int index = 0;
	    for (int i : negativeNumbers) {
	        input[index++] = i;
	    }
	    for (int i : nonNegativeNumbers) {
	        input[index++] = i;
	    }
	}

}
	      
