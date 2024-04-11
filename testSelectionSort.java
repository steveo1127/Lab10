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
				arr[0] = -3;
				arr[1] = -10;
				arr[2] = 0;
				arr[3] = 3;
				arr[4] = 1;
				int[] Sortedarr = new int[5];
				Sortedarr[0] = -10;
				Sortedarr[1] = -3;
				Sortedarr[2] = 0;
				Sortedarr[3] = 1;
				Sortedarr[4] = 3;
				/** add tests to check for this unit test **/
				SelectionSort mixedSort = new SelectionSort();
				int[] output = mixedSort.basicSelectionSort(arr);
				assertArrayEquals(Sortedarr, output);
				}
			public void testDuplicates(){
				/** Test data contains duplicates **/
				int[] arr = new int[5];
				arr[0] = 9;
				arr[1] = 9;
				arr[2] = 0;
				arr[3] = -5;
				arr[4] = -5;
				int[] Sortedarr = new int[5];
				Sortedarr[0] = -5;
				Sortedarr[1] = -5;
				Sortedarr[2] = 0;
				Sortedarr[3] = 9;
				Sortedarr[4] = 9;
				/** add tests to check for this unit test **/
				SelectionSort duplicateSort = new SelectionSort();
				int[] output = duplicateSort.basicSelectionSort(arr);
				assertArrayEquals(Sortedarr, output);
				}
}