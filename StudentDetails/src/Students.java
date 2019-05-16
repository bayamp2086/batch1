
public class Students {

	private String name ;
	private int age ;
	private int number ;
	private int[] marksOfStudents ; 
	private Marks studentMarks;
	
	public Students(String name, int age, int num, Marks studentMarks) {
		this.name = name;
		this.age = age ;
		this.number = num ;
		this.studentMarks = studentMarks ;
	}
	
	public String getName() {
		return name;	
	}

	public int getAge() {
		return age;
	}

	public int getNum() {
		return number;	
	}
	public int[] getMarks() {
		return marksOfStudents;
	}
	
	public Marks getStudentMarks() {
		return studentMarks;
	}
}
