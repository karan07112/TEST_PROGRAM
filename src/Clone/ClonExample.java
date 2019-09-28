package Clone;

public class ClonExample implements Cloneable {

	int i = 20;

	int j = 200;
	
	Clone2 c2;

	public Clone2 getC2() {
		return c2;
	}

	public void setC2(Clone2 c2) {
		this.c2 = c2;
	}

	@Override
	public String toString() {
		return "ClonExample [i=" + i + ", j=" + j + ", c2=" + c2 + "]";
	}

	public ClonExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

		ClonExample o1 = new ClonExample();
		Clone2 c=new Clone2();
		c.c2i=400;
		o1.c2=c;
		
		ClonExample ex = null;

		try {
			ex = (ClonExample) o1.clone();
			ex.setC2( (Clone2)  o1.getC2().clone());
			ex.j = 300;
			ex.c2.c2i = 500;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(o1);
		System.out.println(ex);

	}

}
