package code;

import java.util.HashMap;
import java.util.Random;

public class Timing {

	public static void main(String args[]) {
		
		//binary search
		findAvgBinTime(10);
		findAvgBinTime(50);
		findAvgBinTime(100);
		findAvgBinTime(500);
		findAvgBinTime(1000);
		findAvgBinTime(5000);
		findAvgBinTime(10000);
		findAvgBinTime(50000);
		findAvgBinTime(100000);
		findAvgBinTime(500000);
		
		//ternary search
		findAvgBinTime(10);
		findAvgBinTime(50);
		findAvgBinTime(100);
		findAvgBinTime(500);
		findAvgBinTime(1000);
		findAvgBinTime(5000);
		findAvgBinTime(10000);
		findAvgBinTime(50000);
		findAvgBinTime(100000);
		findAvgBinTime(500000);


	}

	public static void findAvgBinTime(int size) {
		
		Random rd = new Random();

		double[] times = new double[21];
		for (int i = 0; i < 11; i++) {
			int key = rd.nextInt();
			int[] arr1 = newRandArr(size, key);
			long startTime = System.nanoTime();
			BinarySearch.binSearch(arr1, key, 0, arr1.length - 1);
			long endTime = System.nanoTime();
			times[i] = endTime - startTime;
		//	System.out.println(times[i]);
		}

		double timeTotal = 0;
		int numTimes = 0;
		for (int i = 1; i < 11; i++) {
			// skip first one b/c of weird large value
		//	 System.out.println(times[i]);
			 if(times[i] <= 10000) {
				 //I'm getting some wayyy outlier data so I'm removing the ones that are super off
				 timeTotal += times[i];
				 numTimes++;
				 
			 }
		}

		System.out.println("the avg for size = " + size + " is " + timeTotal / numTimes + " nanoseconds.");

	}
	
	public static void findAvgTernTime(int size) {
		
		Random rd = new Random();

		double[] times = new double[21];
		for (int i = 0; i < 11; i++) {
			int key = rd.nextInt();
			int[] arr1 = newRandArr(size, key);
			long startTime = System.nanoTime();
			TernarySearch.ternSearch(arr1, key, 0, arr1.length - 1);
			long endTime = System.nanoTime();
			times[i] = endTime - startTime;
		//	System.out.println(times[i]);
		}

		double timeTotal = 0;
		int numTimes = 0;
		for (int i = 1; i < 11; i++) {
			// skip first one b/c of weird large value
		//	 System.out.println(times[i]);
			 if(times[i] <= 10000) {
				 //I'm getting some wayyy outlier data so I'm removing the ones that are super off
				 timeTotal += times[i];
				 numTimes++;
				 
			 }
		}

		System.out.println("the avg for size = " + size + " is " + timeTotal / numTimes + " nanoseconds.");

	}

	public static int[] newRandArr(int size, int exclude) {
		Random rd = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = rd.nextInt();
			while (arr[i] == exclude) {
				arr[i] = rd.nextInt();
			}
		}
		return arr;
	}

}

//long startTime = System.currentTimeMillis();
//
//doReallyLongThing();
//
//long endTime = System.currentTimeMillis();