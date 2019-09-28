package comparablevsComparator;

import java.util.Comparator;

public class Movie  implements Comparator<Movie>
{
    private double rating;
    private String name;
    private int year;
 
    // Used to sort movies by year

    public Movie(){
    	
    }
    
 
    // Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
 
    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }

	@Override
	public int compare(Movie arg0, Movie arg1) {
		// TODO Auto-generated method stub
		
		
		return arg1.getYear()-arg0.getYear();
	}




}