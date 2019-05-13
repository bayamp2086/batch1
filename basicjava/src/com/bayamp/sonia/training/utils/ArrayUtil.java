package com.bayamp.sonia.training.utils;

import java.util.Arrays;

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

	public static int[] removeDuplicatebyArrayandappendMain(int[] inputArr, int duplicatearr[]) {
		// TODO Auto-generated method stub

		int outArr[] = removeDuplicatebyArrayandappend(duplicatearr, duplicatearr);
		duplicatearr = new int[inputArr.length];

		int outArr1[] = removeDuplicatebyArrayandappend(outArr, duplicatearr);

		SystemPrintClass.print("after copy method return2" + ArrayUtil.toString(duplicatearr));

		int outArr2[] = mergeTwoArray(outArr1, duplicatearr);

		return outArr2;
	}

	public static int[] removeDuplicatebyArrayandappend(int[] inputArr, int duplicatearr[]) {
		// TODO Auto-generated method stub

		int length = inputArr.length;
		int k = 0;
		for (int i = 0; i < length; i++) {
			// System.out.println(inputArr[i]);
			for (int j = i + 1; j < length; j++) {

				if (inputArr[i] == inputArr[j]) {

					duplicatearr[k] = inputArr[j];
					inputArr[j] = inputArr[length - 1];

					k++;
					j--;
					length--;

				}

			}
		}
		// SystemPrintClass.print(ArrayUtil.toString(inputArr));

		int[] newArray = Arrays.copyOf(inputArr, length);
		duplicatearr = Arrays.copyOf(duplicatearr, k);
		SystemPrintClass.print("after copy" + ArrayUtil.toString(duplicatearr));

		return newArray;
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

}
