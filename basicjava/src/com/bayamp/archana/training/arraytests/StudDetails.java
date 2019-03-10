package com.bayamp.archana.training.arraytests;

public class StudDetails {
	public Student1[] stud = new Student1[2];

	public void addNewStuds() {

		Student1 obj1 = new Student1("Mohan", "Karthi", "1", "1001");
		Student1 obj2 = new Student1("Archana", "Mohan", "2", "1002");

		stud[0] = obj1;
		stud[1] = obj2;

	}

	void printStudDetails() {

		for (Student1 temp : stud) {
			System.out.println("Student:" + "\n" + temp.firstName);
			System.out.println(temp.lastName);

		}

	}

	public static void main(String[] args) {

		StudDetails details = new StudDetails();
		details.addNewStuds();
		details.printStudDetails();
	}

}
