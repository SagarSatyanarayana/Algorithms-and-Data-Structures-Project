import java.util.Random;

public class Sorts_Main {

	public static void main(String[] args) {

		insertionSort insertion = new insertionSort();
		mergeSort mms = new mergeSort();
		quickSorts qs = new quickSorts();
		modified_quickSort medianSorterClass = new modified_quickSort();

		long start, finish;
		Random r = new Random();
		int randomNextVal;
		int[] ar1, ar2, ar3, ar4;
		ar1 = ar2 = ar3 = ar4 = new int[200000];

		int[] sortedar1, sortedar2, sortedar3, sortedar4;
		sortedar1 = sortedar2 = sortedar3 = sortedar4 = new int[200000];

		int[] invsrtedar1, invsrtedar2, invsrtedar3, invsrtedar4;
		invsrtedar1 = invsrtedar2 = invsrtedar3 = invsrtedar4 = new int[200000];

		for (int i = 0; i < ar1.length; i++) {
			randomNextVal = r.nextInt(100);
			ar4[i] = ar3[i] = ar2[i] = ar1[i] = randomNextVal;
		}

		for (int i = 0; i < ar1.length; i++) {
			sortedar4[i] = sortedar3[i] = sortedar2[i] = sortedar1[i] = i;
		}

		for (int i = invsrtedar4.length-1; i >= 0; i--) {
			invsrtedar4[i] = invsrtedar3[i] = invsrtedar2[i] = invsrtedar1[i] = i;
		}
		

		
		start = System.currentTimeMillis();
		ar3 = qs.sort(ar3);
		finish = System.currentTimeMillis();
		System.out.println("Time taken for quick sorting is " + (finish - start) / 1.0 + " milliseconds");
/*
		System.out.println("Elements After inertion sorting..");

		for (int i = 0; i < ar3.length; i++) {
			System.out.print(ar3[i] + ", ");
		}*/
		
		/*
		start = System.currentTimeMillis();
		sortedar3 = qs.sort(sortedar3);
		finish = System.currentTimeMillis();
		
		start = System.currentTimeMillis();
		invsrtedar3 = qs.sort(invsrtedar3);
		finish = System.currentTimeMillis();*/
		

		start = System.currentTimeMillis();
		ar1 = insertion.doInsertionSort(ar1);
		finish = System.currentTimeMillis();
		System.out.println("Time taken for insertion sorting is " + (finish - start) / 1.0 + " milliseconds");
/*
		System.out.println("Elements After inertion sorting..");

		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + ", ");
		}*/

//		start = System.currentTimeMillis();
//		sortedar1 = insertion.doInsertionSort(sortedar1);
//		finish = System.currentTimeMillis();
//		System.out.println("Time taken for insertion sorting of is " + (finish - start) / 1.0 + " milliseconds");
		
		
//		start = System.currentTimeMillis();
//		invsrtedar1 = insertion.doInsertionSort(invsrtedar1);
//		finish = System.currentTimeMillis();
		
		
		start = System.currentTimeMillis();
		ar2 = mms.sort(ar2);
		finish = System.currentTimeMillis();
		System.out.println("Time taken for merge sorting is " + (finish - start) / 1.0 + " milliseconds");

//		System.out.println("Elements After inertion sorting..");

//		for (int i = 0; i < ar2.length; i++) {
//			System.out.print(ar2[i] + ", ");
//		}*/
		
//		start = System.currentTimeMillis();
//		sortedar2 = mms.sort(sortedar2);
//		finish = System.currentTimeMillis();
//		
//		
//		start = System.currentTimeMillis();
//		invsrtedar2 = mms.sort(invsrtedar2);
//		finish = System.currentTimeMillis();
		
		
		
		start = System.currentTimeMillis();
		ar4 = medianSorterClass.sort(ar4);
		finish = System.currentTimeMillis();
		System.out.println("Time taken for modified quick sorting is " + (finish - start) / 1.0 + " milliseconds");
/*
		System.out.println("Elements After inertion sorting..");

		for (int i = 0; i < ar4.length; i++) {
			System.out.print(ar4[i] + ", ");
		}*/
		
		
//		start = System.currentTimeMillis();
//		sortedar4 = medianSorterClass.sort(sortedar4);
//		finish = System.currentTimeMillis();
//		
//		start = System.currentTimeMillis();
//		invsrtedar4 = medianSorterClass.sort(invsrtedar4);
//		finish = System.currentTimeMillis();
		
		

	}

}
