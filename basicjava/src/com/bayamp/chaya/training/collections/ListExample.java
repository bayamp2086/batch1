package com.bayamp.chaya.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.bayamp.chaya.training.constructorandinheritence.Address2;
import com.bayamp.chaya.training.constructorandinheritence.Person;

public class ListExample {

	public static void main(String[] args) {
		List<Person> personArrayList = new ArrayList<Person>();
		String firstname1 = new String("Chaya");
		String lastname1 = new String("Basavarajaiah");
		String unitNumber1 = new String("112");
		String streetNumber1 = new String("Carlyle ct");
		String city1 = new String("Santa Clara");
		String state1 = new String("California");
		String pinCode1 = new String("95054");
		Address2 address1 = new Address2(unitNumber1, streetNumber1, city1, state1, pinCode1);
		String firstname2 = new String("Shashi");
		String lastname2 = new String("Shekhar");
		String unitNumber2 = new String("4507");
		String streetNumber2 = new String("Carlyle ct");
		String city2 = new String("Santa Clara");
		String state2 = new String("California");
		String pinCode2 = new String("95054");
		Address2 address2 = new Address2(unitNumber2, streetNumber2, city2, state2, pinCode2);
		String firstname3 = new String("Karthik");
		String lastname3 = new String("Chandra");
		String unitNumber3 = new String("2585");
		String streetNumber3 = new String("Seabreeze Ct");
		String city3 = new String("Hayward");
		String state3 = new String("California");
		String pinCode3 = new String("94542");
		Address2 address3 = new Address2(unitNumber3, streetNumber3, city3, state3, pinCode3);
		String firstname4 = new String("Neha");
		String lastname4 = new String("KC");
		String unitNumber4 = new String("2585");
		String streetNumber4 = new String("Seabreeze Ct");
		String city4 = new String("Hayward");
		String state4 = new String("California");
		String pinCode4 = new String("94542");
		Address2 address4 = new Address2(unitNumber4, streetNumber4, city4, state4, pinCode4);
		Person person1 = new Person(firstname1, lastname1, address1);
		Person person2 = new Person(firstname2, lastname2, address2);
		Person person3 = new Person(firstname3, lastname3, address3);
		Person person4 = new Person(firstname4, lastname4, address4);

		personArrayList.add(person1);
		personArrayList.add(person2);
		personArrayList.add(person3);
		personArrayList.add(person4);
		System.out.println("****ArrayList Print****");

		System.out.println("Using print option");
		System.out.println("**************************");

		System.out.println(personArrayList);
		System.out.println("**************************");
		System.out.println("Using For Each loop");
		System.out.println("**************************");
		for (Person p : personArrayList) {
			System.out.println(p);
		}
		System.out.println("**************************");

		System.out.println("Using Iterator");
		System.out.println("**************************");

		Iterator<Person> it = personArrayList.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		List<Person> personLinkedList = new LinkedList<Person>();
		personLinkedList.add(person1);
		personLinkedList.add(person2);
		personLinkedList.add(person3);
		personLinkedList.add(person4);
		personLinkedList.add(person4);

		
		
		System.out.println("****LinkedList Print****");
		System.out.println("Using print option");
		System.out.println("**************************");

		System.out.println(personLinkedList);
		System.out.println("**************************");
		System.out.println("Using For Each loop");
		System.out.println("**************************");
		for (Person p : personLinkedList) {
			System.out.println(p);
		}
		System.out.println("**************************");

		System.out.println("Using Iterator");
		System.out.println("**************************");

		Iterator<Person> it2 = personLinkedList.iterator();
		while (it2.hasNext())
			System.out.println(it2.next());
	}

}
