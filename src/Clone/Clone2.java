package Clone;

public class Clone2 implements Cloneable {

	public Clone2() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	int c2i;

	@Override
	public String toString() {
		return "Clone2 [c2i=" + c2i + "]";
	}
	
	

}
