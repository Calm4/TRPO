package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTests {

	@Test
	public void testRadixSort1() {
		int[] testArray = new int[] {5,2,91,24}; 
		int[] expectedArray = new int[] {2,5,24,91}; 
		RadixSort.radixSort(testArray);
		assertArrayEquals(expectedArray, testArray);
		//assertEquals(expectedArray,testArray);
	}
	@Test
	public void testRadixSort2() {
		int[] testArray = new int[] {4,3,2,1}; 
		int[] expectedArray = new int[] {1,2,3,4}; 
		RadixSort.radixSort(testArray);
		assertArrayEquals(expectedArray, testArray);
		//assertEquals(expectedArray,testArray);
	}
	@Test
	public void testRadixSort3() {
		int[] testArray = new int[] {255,512,-255,-512}; 
		int[] expectedArray = new int[] {-512,-255,255,512}; 
		RadixSort.radixSort(testArray);
		assertArrayEquals(expectedArray, testArray);
		//assertEquals(expectedArray,testArray);
	}
	@Test
	public void testRadixSort4() {
		int[] testArray = new int[] {0,0,0,0}; 
		int[] expectedArray = new int[] {0,0,0,0}; 
		RadixSort.radixSort(testArray);
		assertArrayEquals(expectedArray, testArray);
		//assertEquals(expectedArray,testArray);
	}
	@Test
	public void testRadixSort5() {
		int[] testArray = new int[] {5346,13466432,-5236491,134624,0,2359,-214939}; 
		int[] expectedArray = new int[] {-5236491,-214939,0,2359,5346,134624,13466432}; 
		RadixSort.radixSort(testArray);
		assertArrayEquals(expectedArray, testArray);
		//assertEquals(expectedArray,testArray);
	}
	@Test
	public void testRadixSort6() {
		int[] testArray = new int[] {10,9,8,7,6,5,4,3,2,1,0}; 
		int[] expectedArray = new int[] {0,1,2,3,4,5,6,7,8,9,10}; 
		RadixSort.radixSort(testArray);
		assertArrayEquals(expectedArray, testArray);
		//assertEquals(expectedArray,testArray);
	}
	@Test
	public void testRadixSort7() {
		int[] testArray = new int[] {5,4,3,2,1,0,-1,-2,-3,-4,-5}; 
		int[] expectedArray = new int[] {-5,-4,-3,-2,-1,0,1,2,3,4,5}; 
		RadixSort.radixSort(testArray);
		assertArrayEquals(expectedArray, testArray);
		//assertEquals(expectedArray,testArray);
	}
	@Test
	public void testRadixSort8() {
		int[] testArray = new int[] {1,0,-1}; 
		int[] expectedArray = new int[] {-1,0,1}; 
		RadixSort.radixSort(testArray);
		assertArrayEquals(expectedArray, testArray);
		//assertEquals(expectedArray,testArray);
	}
	@Test
	public void testRadixSort9() {
		int[] testArray = new int[] {1,1,1,1,1,1,1,1,1}; 
		int[] expectedArray = new int[] {1,1,1,1,1,1,1,1,1}; 
		RadixSort.radixSort(testArray);
		assertArrayEquals(expectedArray, testArray);
		//assertEquals(expectedArray,testArray);
	}
	@Test
	public void testRadixSort010() {
		int[] testArray = new int[] {}; 
		int[] expectedArray = new int[] {}; 
		RadixSort.radixSort(testArray);
		assertArrayEquals(expectedArray, testArray);
		//assertEquals(expectedArray,testArray);
	}
	

}
