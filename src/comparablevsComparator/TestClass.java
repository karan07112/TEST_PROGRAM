package comparablevsComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestClass {

	
	
	public static void main(String args[]){
	     
		List<Movie> movieList=new ArrayList<Movie>();
	 	Movie m1=new Movie("karan", 6.7, 2015);
		Movie m2=new Movie("shavnam",4.7, 2008);
		Movie m3=new Movie("manaynk", 5.5, 2005);
		Movie m4=new Movie("monika", 7.5, 2010);
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		System.out.println("before sorting collection"  + movieList.toString());
		
		movieList.forEach(new Consumer<Movie>() {
			public void accept(Movie t){
				System.out.println("öbj"+ t.getName());
			}
		});
		
		 
	//	MyITerator<Movie> i=new  MyITerator<Movie>();
		
	//	movieList.forEach(i);
	
		
		
		Collections.sort(movieList,new  Movie());
		
		movieList.forEach(new Consumer<Movie>() {
			
			public void accept(Movie t){
				
				System.out.println("obj2" +t.getName());
			}
			
		});
		
	    System.out.println("after sorting collection" + movieList.toString());

	}
	
}
