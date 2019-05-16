
public class StudentTest {

	public static void main(String[] args) {
	
//		int[] marks = {80,60};
		//Students stud = new Students("Arya", 2, 1,marks);
		
		
		Marks studMark = new Marks(99, 80, 97);
		Marks studMark1 = new Marks(70, 80, 97);
		int sumOfTotal = studMark.getTotal();
		System.out.println("Total marks of Arya: "+sumOfTotal);
		Students sibiStudent = new Students ("Sibi", 2, 1, studMark1);
		//int engMark = studMark.getEng();
		System.out.println("English Mark of Sibi " +sibiStudent.getStudentMarks().getEng());
		System.out.println("Maths Mark of Sibi " +sibiStudent.getStudentMarks().getMaths());
		System.out.println("Science Mark of Sibi " +sibiStudent.getStudentMarks().getScience());
		System.out.println("TotalMark of Sibi " + sibiStudent.getStudentMarks().getTotal());
		
	}

}
