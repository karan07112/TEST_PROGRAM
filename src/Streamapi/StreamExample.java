package Streamapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamExample {

	
	public static <E> void main(String args[]){
		
		System.out.println(":::::");
		List<String>  strr=new ArrayList<String>();
		
     Collection<E>  sss=new ArrayList<E>();
 		
		for(int i=0;i<=10 ;i++){
			System.out.println(i);
		strr.add("karan");
		strr.add("singh");
		}
		System.out.println(strr);
	System.out.println(strr.stream().filter(str->str.startsWith("s")).count());
		
	List<String> names = new ArrayList<String>();
	names.add("Ajeettttt");
	names.add("Negan");
	names.add("Aditya");
	names.add("Steve");
		
	//Using Stream and Lambda expression
	long count = names.stream().filter(str->str.startsWith("N")).count();
	System.out.println("There are "+count+" strings with length less than 6");

		
		
	}
	
	
}

