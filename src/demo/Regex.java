package demo;
import java.util.regex.*;
public class Regex {

	
	
	
	public static void main(String args[]){
	
	
	
		        Pattern p = Pattern.compile("\\<!(.*?)\\!>");
		        Matcher m = p.matcher("i, a Class 10 student in <!name!> Indore said,");
		        while(m.find()) {
		             System.out.println(m.group(1));
		        }
		    

		
 
	}
}
