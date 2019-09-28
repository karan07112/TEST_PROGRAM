package DesignPatterns;

public class Student {

	private String name;
	private String lastname;
	private String address;
	private String className;
	private String rollNo;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(StudentBuilder build) {
		// TODO Auto-generated constructor stub
		this.address = build.address;
		this.className = build.className;
		this.lastname = build.lastname;
		this.name = build.name;
		this.rollNo = build.rollNo;

	}

	public static class StudentBuilder {

		private String name;
		private String lastname;
		private String address;
		private String className;
		private String rollNo;

		public StudentBuilder(String name, String lastname, String address,
				String className, String rollNo) {
			this.name = name;
			this.lastname = lastname;
			this.address = address;
			this.className = className;
			this.rollNo = rollNo;
		}

		
		
		public StudentBuilder() {
		}



		public StudentBuilder setName(String name) {
			this.name = name;

			return this;
		}

		public StudentBuilder setLastname(String lastname) {
			this.lastname = lastname;
			return this;
		}

		public StudentBuilder setAddress(String address) {
			this.address = address;

			return this;
		}

		public StudentBuilder setClassName(String className) {
			this.className = className;

			return this;
		}

		public StudentBuilder setRollNo(String rollNo) {
			this.rollNo = rollNo;

			return this;
		}

		public Student build() {

			return new Student(this);
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname
				+ ", address=" + address + ", className=" + className
				+ ", rollNo=" + rollNo + "]";
	}

	public static void main(String[] args) {

		Student s = new Student.StudentBuilder().setAddress("ladraur")
				.setClassName("'10+2")
			//	.setLastname("thakur")
				.setName("karan")
				.setRollNo("81608133").build();
		
		System.out.println(s.toString());

	}

}
