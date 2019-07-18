package com.bayamp.sonia.training.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayUtil {

	public static int finalnumb = 1;

	public int[] findSecondHighNumbAndIndex(int arr[]) {

		int high = -1;

		int nexthighElement = -1;
		int index = 0;
		int arr1[] = new int[2];

		for (int i = 0; i < arr.length; i++) {

			if (high < arr[i]) {

				nexthighElement = high;
				high = arr[i];

			} else if (arr[i] > nexthighElement && arr[i] != high) {

				nexthighElement = arr[i];

			}

			if (arr[i] == nexthighElement) {

				index = i;
			}

		}

		arr1[0] = nexthighElement;
		arr1[1] = index;

		return arr1;
	}

	public int[] findHighNumbAndIndex(int arr[]) {

		int high = -1;

		int index = 0;
		int arr1[] = new int[2];

		for (int i = 0; i < arr.length; i++) {

			if (high < arr[i]) {

				high = arr[i];

				index = i;

			}

		}

		arr1[0] = high;
		arr1[1] = index;

		return arr1;
	}

	public int[] findlowestNumbAndIndex(int arr[]) {

		int low = 1000;

		int index = 0;
		int arr1[] = new int[2];

		for (int i = 0; i < arr.length; i++) {

			if (low > arr[i]) {

				low = arr[i];

				index = i;

			}

		}

		arr1[0] = low;
		arr1[1] = index;

		return arr1;
	}

	public int[] findSecondLowestNumbAndIndex(int arr[]) {

		int low = 1000;

		int nextlowElement = 1000;
		int index = 0;
		int arrOutput[] = new int[2];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < low) {

				nextlowElement = low;
				low = arr[i];

			} else if (arr[i] < nextlowElement && arr[i] != low) {

				nextlowElement = arr[i];

			}

			if (arr[i] == nextlowElement) {

				index = i;
			}

		}

		arrOutput[0] = nextlowElement;
		arrOutput[1] = index;

		return arrOutput;
	}

	public static int findFirstHigestnumber(int arr[]) {

		int max = -1;

		for (int element : arr) {
			if (element > max) {
				max = element;
			}
		}
		return max;

	}

	public static int findFirstLowestnumber(int arr[]) {
		int min = 1000;

		for (int element : arr) {

			if (element < min) {
				min = element;
			}
		}
		return min;
	}

	public static int findSecondHigestnumber(int arr[]) {

		int max = -1;
		int nextMax = -1;

		for (int element : arr) {
			if (element > max) {
				nextMax = max;
				max = element;
			} else if (element > nextMax) {
				nextMax = element;
			}
		}
		return nextMax;

	}

	public static int findSecondLowestnumber(int arr[]) {
		int min = 1000;
		int nextmin = 1000;

		for (int element : arr) {

			if (element < min) {
				nextmin = min;
				min = element;
			} else if (element < nextmin) {
				nextmin = element;
			}
		}
		return nextmin;
	}

	public static int[] removeDuplicate(int[] inputArr) {
		// TODO Auto-generated method stub

		int current = inputArr[0];
		boolean found = false;

		int arr[] = new int[inputArr.length];
		int k = 0;

		for (int i = 0; i < inputArr.length; i++) {
			if (current == inputArr[i] && !found) {
				found = true;
			} else if (current != inputArr[i]) {
				System.out.print(" " + current);
				arr[k] = current;
				current = inputArr[i];
				found = false;
				k++;
			}
		}

		return arr;

	}

	public static int[] removeDuplicatebyArray(int[] inputArr) {
		// TODO Auto-generated method stub

		int length = inputArr.length;

		for (int i = 0; i < length; i++) {

			for (int j = i + 1; j < length; j++) {

				if (inputArr[i] == inputArr[j]) {

					inputArr[j] = inputArr[length - 1];
					j--;
					length--;
				}

			}
		}
		// SystemPrintClass.print(ArrayUtil.toString(inputArr));

		int[] newArray = Arrays.copyOf(inputArr, length);
		return newArray;
	}

	public static List<Integer> removeDuplicatebyArrayandappend(int[] inputArr) {
		// TODO Auto-generated method stub

		int length = inputArr.length;

		Set<Integer> duplicateSet = new LinkedHashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < length; i++) {
			if (list.contains(inputArr[i])) {
				duplicateSet.add(inputArr[i]);

			} else {
				list.add(inputArr[i]);
			}
		}

		list.removeAll(duplicateSet);

		list.addAll(duplicateSet);
		return list;
	}

	public static int[] appendzeroatEnd(int[] inputArr) {

		int k[] = new int[inputArr.length];
		int count = 0;

		for (int i = 0; i < inputArr.length; i++) {

			if (inputArr[i] != 0) {

				k[count] = inputArr[i];
				count++;
			}

		}

		while (count < inputArr.length) {

			k[count] = 0;
			count++;
		}
		return k;
	}

	public static int[] mergeTwoArray(int[] inputArr1, int[] inputArr2) {
		// TODO Auto-generated method stub

		int newArr[] = new int[inputArr1.length + inputArr2.length];
		int k = 0;
		for (int element : inputArr1) {
			newArr[k] = element;
			k++;
		}

		for (int element : inputArr2) {
			newArr[k] = element;
			k++;
		}
		return newArr;
	}

	public static String toString(int[] arr) {

		StringBuffer bf = new StringBuffer();
		bf.append("[");
		for (int element : arr) {
			bf.append(element);
			bf.append(",");
		}

		bf.append("]");

		// bf.toString().replaceAll(",]","]");

		return bf.toString().replaceAll(",]", "]");
	}

	public static Object[] arraysCopy(Object[] inputArr, int length) {

		Object outArr[] = Arrays.copyOf(inputArr, length);
		return outArr;

	}

	public static int getpower(int number, int numpower) {
		int finalnumb = 1;
		for (int i = 0; i < numpower; i++) {
			finalnumb = finalnumb * number;
		}

		return finalnumb;
	}

	public static int getpowerRecusrive(int num, int numberpower) {

		if (numberpower > 1) {
			finalnumb = num * finalnumb;
			numberpower--;
			getpowerRecusrive(finalnumb, numberpower);
		}

		return finalnumb;
	}

	public static int[] sortArray(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;

	}
	
	public static int[][] MergeOverLappingInterval(int arr[][]) {

		int outputArr[][] = new int[3][2];

		int l = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int k = 0;
			for (int j = 0; j < arr[i].length - 1; j++) {

				int first = arr[i][j];
				int second = arr[i][j + 1];
				int third = arr[i + 1][j];
				int fourth = arr[i + 1][j + 1];
				if (third > first && third < second) {
					outputArr[l][k] = first;
					outputArr[l][k+1] = fourth;
				l++;
				k++;
				}
			}
		}

		return outputArr;

	}

}
