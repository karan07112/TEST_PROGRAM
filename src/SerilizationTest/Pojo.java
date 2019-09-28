package SerilizationTest;

import java.io.Serializable;

public class Pojo implements Serializable {
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1152675493864472846L;
	/**
	 * 
	 */
    private int iddd;
	private String name;
	
	public int getId() {
		return iddd;
	}
	public void setId(int id) {
		this.iddd = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
