package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	
	    public static void main(String args[]) throws IOException{
		System.out.println("======================");
		
		try {
			File f=new File("D://demo.txt");
		if(!f.isFile())
		{
		f.createNewFile();	
		}
			FileOutputStream os=new FileOutputStream(f);
			String srtr="java ";
			os.write(srtr.getBytes());
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f1=new File("D://demo1.txt");
		if(!f1.isFile())
		{
		f1.createNewFile();	
		}
		 FileWriter fr=new FileWriter(f1);
		
		 int j=0;
		 for(int i=0;i<1000000;i++){
			 System.out.println("num"+i);
			 fr.write("num"+i);
			
			 if(j>1000){
				 j=0;
				 try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
				 
			     j++;
	         }
		 
	//	 fr.flush();
		 fr.close();
		 
		   
		
	   }
	    
	    
	    
	    
	
}
