
public class Teacher implements Cloneable {

	private String name;
	private String lastName;
	private String address;
	private Student  student;
	


	public Teacher() {
		// TODO Auto-generated constructor stub
			
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", lastName=" + lastName
				+ ", address=" + address + ", student=" + student.toString() + "]";
	}

	public Teacher(String name, String lastName, String address) {
		this.name = name;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		    Teacher   t=         (Teacher) super.clone();
		
		     t.setStudent((Student)t.getStudent().clone());
		
		return t;
	}

}
