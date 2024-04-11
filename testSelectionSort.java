import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testSelectionSort {

	@Test
	     public void test() {
			testPositive();
			testNegative();
			testMixed();
			testDuplicates();
			}
			public testSelectionSort() {
			}
			public void testPositive(){
			int[] arr = new int[5];
			arr[0] = 4;
			arr[1] = 9;
			arr[2] = 13;
			arr[3] = 10;
			arr[4] = 2;
			int[] Sortedarr = new int[5];
			Sortedarr[0] = 2;
			Sortedarr[1] = 4;
			Sortedarr[2] = 9;
			Sortedarr[3] = 10;
			Sortedarr[4] = 13;
			/** add tests to check for this unit test **/
			SelectionSort positiveSort = new SelectionSort();
			int[] output = positiveSort.basicSelectionSort(arr);
			assertArrayEquals(Sortedarr, output);
			}
			public void testNegative(){
				/** Test data contains negative values only **/
				int[] arr = new int[5];
				arr[0] = -15;
				arr[1] = -9;
				arr[2] = -7;
				arr[3] = -1;
				arr[4] = -2;
				int[] Sortedarr = new int[5];
				Sortedarr[0] = -15;
				Sortedarr[1] = -9;
				Sortedarr[2] = -7;
				Sortedarr[3] = -2;
				Sortedarr[4] = -1;
				/** add tests to check for this unit test **/
				SelectionSort negativeSort = new SelectionSort();
				int[] output = negativeSort.basicSelectionSort(arr);
				assertArrayEquals(Sortedarr, output);
				}
			public void testMixed(){
				/** Test data contains with both positive, negative and zeros **/
				int[] arr = new int[5];
				arr[0] = -8;
				arr[1] = -9;
				arr[2] = -0;
				arr[3] = 7;
				arr[4] = 1;
				int[] Sortedarr = new int[5];
				Sortedarr[0] = -9;
				Sortedarr[1] = -8;
				Sortedarr[2] = 0;
				Sortedarr[3] = 1;
				Sortedarr[4] = 7;
				/** add tests to check for this unit test **/
				SelectionSort mixedSort = new SelectionSort();
				int[] output = mixedSort.basicSelectionSort(arr);
				assertArrayEquals(Sortedarr, output);
				}
			public void testDuplicates(){
				/** Test data contains duplicates **/
				int[] arr = new int[5];
				arr[0] = 7;
				arr[1] = 7;
				arr[2] = 0;
				arr[3] = -8;
				arr[4] = -8;
				int[] Sortedarr = new int[5];
				Sortedarr[0] = -8;
				Sortedarr[1] = -8;
				Sortedarr[2] = 0;
				Sortedarr[3] = 7;
				Sortedarr[4] = 7;
				/** add tests to check for this unit test **/
				SelectionSort duplicateSort = new SelectionSort();
				int[] output = duplicateSort.basicSelectionSort(arr);
				assertArrayEquals(Sortedarr, output);
				}
}