package demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InputOutput {

	public static String heelo="this is demo ";
	public String demo="this is demo2";
	
	  public static class Person implements Serializable {
	        public String name = null;
	        public int    age  =   0;
	    }

	
	  
	  
	public static void main(String args[]) throws IOException{
		
	 BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D://bufferdemo.txt"));
	 bos.write(heelo.getBytes());
		bos.flush();
		bos.close();

		
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D://bufferdemo.txt"));
		int a;
		while((a=bis.read())!=-1){
		System.out.println(	(char)a);
		}
	
		bis.close();
		
		
	}
	

		
		
		
		
	
	
}
