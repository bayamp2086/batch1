
public class Marks {

	private int maths;
	private int science;
	private int english;

	public Marks(int math, int sc, int eng) {
		this.maths = math;
		this.science = sc;
		this.english = eng;	
	}

	public int getMaths() {
		return maths;	
	}
	public int getScience() {
		return science;	
	}
	public int getEng() {
		return english;	
	}

	public int getTotal() {
		int total = maths + science + english;
		return total;
	}

}
