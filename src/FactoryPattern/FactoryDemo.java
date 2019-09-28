package FactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryDemo {

	
	public static void main(String args[]){
		
		 ShapeFactory obj=new ShapeFactory();
		  String s="";
		  
		  boolean check=true;
		  
		  while(check){
			  
		    try {
		          BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		          s=bf.readLine();
		        
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			    }
		
		    if(!s.equalsIgnoreCase("end")){
		    obj.getShape(s).draw();}
		    else{
		    	check=false;
		    }
			
		  }
	}
	
	
}
