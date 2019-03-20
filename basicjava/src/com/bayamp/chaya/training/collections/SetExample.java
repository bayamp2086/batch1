package com.bayamp.chaya.training.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	private static void addElements(Collection<String> col) {
		col.add("chaya");
		col.add("Shashi");
		col.add("Vidita");
		col.add("Lipi");
		col.add("Hrithik");
		col.add("chaya");
	}

	private static void showElements(Collection<String> col) {
		System.out.println(col);
		System.out.println("##Using For Each##");
		for (String set : col) {
			System.out.println(set);
		}
		System.out.println("##Using Iterator##");
		Iterator<String> itr = col.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				int len1 = s1.length();
				int len2 = s2.length();
				if (len1 > len2) {
					return 1;
				} else if (len1 < len2) {
					return -1;
				}
				return s1.compareTo(s2);
			}
		});

		addElements(hashSet);
		addElements(linkedHashSet);
		addElements(treeSet);

		System.out.println("*****Printing HashSet*****");
		showElements(hashSet);
		System.out.println();
		System.out.println("*****Printing LinedHashSet*****");
		showElements(linkedHashSet);
		System.out.println();
		System.out.println("*****Printing TreeSet*****");
		showElements(treeSet);

	}
}
