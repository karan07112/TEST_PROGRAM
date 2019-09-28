import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Sorting implements Comparable<Sorting> , Comparator<Sorting> {

	private String name;
	private int rollNo;
	private String subject;

	public Sorting() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Sorting(String name, int rollNo, String subject) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Sorting [name=" + name + ", rollNo=" + rollNo + ", subject="
				+ subject + "]";
	}

	public static void main(String args[]) {

		ArrayList<Sorting> sorting1 = new ArrayList<Sorting>();

		Sorting s1 = new Sorting("karan", 1, "en");
		Sorting s2 = new Sorting("karan", 2, "en");
		Sorting s3 = new Sorting("karan", 3, "en");
		Sorting s4 = new Sorting("karan", 4, "en");

		sorting1.add(s2);
		sorting1.add(s4);
		sorting1.add(s3);
	    sorting1.add(s1);
		
		String s=new String();

		System.out.println(sorting1);

		Collections.sort(sorting1);
		
		
		System.out.println(sorting1);
		
		Collections.sort(sorting1, new Sorting());

		System.out.println(sorting1);
		
	}

	@Override
	public int compareTo(Sorting o) {
		// TODO Auto-generated method stub
		return this.rollNo - o.rollNo;
	}

	@Override
	public int compare(Sorting o1, Sorting o2) {
		// TODO Auto-generated method stub
		
		
		
		return o2.rollNo- o1.rollNo;
	}
}
