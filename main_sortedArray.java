import java.util.Random;

public class main_sortedArray {
	public static void main(String[] args) {

		insertionSort insertion = new insertionSort();
		mergeSort mms = new mergeSort();
		quickSorts qs = new quickSorts();
		modified_quickSort medianSorterClass = new modified_quickSort();

		long start, finish;
		Random r = new Random();
		int[] sortedar1, sortedar2, sortedar3, sortedar4;
		sortedar1 = sortedar2 = sortedar3 = sortedar4 = new int[20000];
		
		int randomNextVal;
		int[] ar1, ar2, ar3, ar4;
		ar1 = ar2 = ar3 = ar4 = new int[20000];
		for (int i = 0; i < ar1.length; i++) {
			sortedar4[i] = sortedar3[i] = sortedar2[i] = sortedar1[i] = i;}
		for (int i = 0; i < ar1.length; i++) {
			randomNextVal = r.nextInt(100);
			ar4[i] = ar3[i] = ar2[i] = ar1[i] = randomNextVal;
		}
			
			start = System.currentTimeMillis();
			sortedar3 = qs.sort(sortedar3);
			finish = System.currentTimeMillis();
			System.out.println("Time taken for quick sorting of is " + (finish - start) / 1.0 + " milliseconds");
			
			start = System.currentTimeMillis();
			sortedar1 = insertion.doInsertionSort(sortedar1);
		    finish = System.currentTimeMillis();
			System.out.println("Time taken for insertion sorting of is " + (finish - start) / 1.0 + " milliseconds");
		
			start = System.currentTimeMillis();
		sortedar2 = mms.sort(sortedar2);
			finish = System.currentTimeMillis();
			System.out.println("Time taken for merge sorting of is " + (finish - start) / 1.0 + " milliseconds");
			
			start = System.currentTimeMillis();
			sortedar4 = medianSorterClass.sort(sortedar4);
		finish = System.currentTimeMillis();
		System.out.println("Time taken for modified quicksort sorting of is " + (finish - start) / 1.0 + " milliseconds");
		
		
		}
	}

