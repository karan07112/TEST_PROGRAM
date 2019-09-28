
public class Student implements Cloneable {

	private String name;
	private String lastName;
	private String address;
	
	public Student() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", lastName=" + lastName
				+ ", address=" + address + "]";
	}

	public Student(String name, String lastName, String address) {
		super();
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
	

	

}
