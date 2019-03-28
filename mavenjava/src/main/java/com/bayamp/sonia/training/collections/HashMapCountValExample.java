package com.bayamp.sonia.training.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bayamp.sonia.training.utils.CollectionsUtils;

public class HashMapCountValExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruitArray = { "apple", "apple", "banana", "cherry", "apple", "apple", "cherry", "strawberry", "apple",
				"cherry", "banana" };

		Map<String, Integer> fruitMap = CollectionsUtils.getFruitArrayCountMap(fruitArray);

		System.out.println(fruitMap);

		int[] numbArray = { 4, 3, 4, 4, 4, 3, 6, 7, 1, 2, 3, 4, 5, 7, 1, 1, 1 };

		Map<String, Integer> numberMap = CollectionsUtils.getNumberArrayCountMap(numbArray);
		System.out.println(numberMap);

		String str = "abcdabcdabcdabcdab";
		str = "aaabbxaadbbbbym";
		
		

		String outPutStr = CollectionsUtils.getCharCountString(str);
		System.out.println(outPutStr);
		
		str = "aaabbxaadddy";
		
		

		String outPutStr1 = CollectionsUtils.getCharCountStringbySequence(str);
		System.out.println(outPutStr1);
		
		
	}

}
