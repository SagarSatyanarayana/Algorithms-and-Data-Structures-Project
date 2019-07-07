import java.util.Random;

public class main_inverseSorted {
	
	public static void main(String[] args) {
	insertionSort insertion = new insertionSort();
	mergeSort mms = new mergeSort();
	quickSorts qs = new quickSorts();
	modified_quickSort medianSorterClass = new modified_quickSort();

	long start, finish;
	Random r = new Random();
	int randomNextVal;
	int[] ar1, ar2, ar3, ar4;
	ar1 = ar2 = ar3 = ar4 = new int[10000];

	int[] invsrtedar1, invsrtedar2, invsrtedar3, invsrtedar4;
	invsrtedar1 = invsrtedar2 = invsrtedar3 = invsrtedar4 = new int[10000];

	for (int i = 0; i < ar1.length; i++) {
		randomNextVal = r.nextInt(100);
		ar4[i] = ar3[i] = ar2[i] = ar1[i] = randomNextVal;
	}
	
	
	for (int i = invsrtedar4.length-1; i >= 0; i--) {
		invsrtedar4[i] = invsrtedar3[i] = invsrtedar2[i] = invsrtedar1[i] = i;
	}
	
	start = System.currentTimeMillis();
	invsrtedar3 = qs.sort(invsrtedar3);
	finish = System.currentTimeMillis();
	System.out.println("Time taken for  quick sorting is " + (finish - start) / 1.0 + " milliseconds");
	
	
	start = System.currentTimeMillis();
	invsrtedar1 = insertion.doInsertionSort(invsrtedar1);
	finish = System.currentTimeMillis();
	System.out.println("Time taken for  insertion sorting is " + (finish - start) / 1.0 + " milliseconds");
	
	
	start = System.currentTimeMillis();
	invsrtedar2 = mms.sort(invsrtedar2);
	finish = System.currentTimeMillis();
	System.out.println("Time taken for merge sorting is " + (finish - start) / 1.0 + " milliseconds");
	
	start = System.currentTimeMillis();
	invsrtedar4 = medianSorterClass.sort(invsrtedar4);
	finish = System.currentTimeMillis();
	System.out.println("Time taken for modified quick sorting is " + (finish - start) / 1.0 + " milliseconds");
	
	
}
}

