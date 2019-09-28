package Collections;

import java.util.HashMap;
import java.util.Iterator;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String args[]){
		
		
		HashMap<String, String>  map=new HashMap<String, String>();
		map.put("1", "karan");
		map.put("2", "Singh");
		
		
		Iterator<String>  str=map.values().iterator();
		str.hasNext();
		
		str.next();
		
	}
	
	
}
