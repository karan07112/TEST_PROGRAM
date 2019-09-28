package SerilizationTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.xml.bind.JAXB;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	  serilizeobj();
		//deserializeObj();
	}

	
	public static void serilizeobj() throws IOException{
		
		
		try{
			
			throw new NullPointerException();
		}finally{
		System.out.println("finalyy");	
		System.out.println("_______");
		}
		
		
		
		
		/*
		Pojo obj=new Pojo();
		obj.setId(10);
		obj.setName("Karannnnn");
		FileOutputStream os=null;
		ObjectOutputStream oo=null;
		try {
			 os=new FileOutputStream("D://serializationtest.txt");
			 oo=new ObjectOutputStream(os);
			oo.writeObject(obj);
			oo.close();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(oo!=null){
					oo.close();
			}
		
			if(os!=null){
				os.close();
			}
			
		}*/
	}
	
	public static void deserializeObj(){
		
		FileInputStream fs=null;
		ObjectInputStream os=null;
		 try {
			fs=new FileInputStream("D://serializationtest.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		try {
			os=new ObjectInputStream(fs);
	Object o=os.readObject();
    Pojo po=(Pojo)o;
    if(po!=null){
    	System.out.println(":-----Object after deserialzation------:");
        System.out.println(po.getId() + "_____________ "+po.getName());
    }else{
    	System.out.println("No data found");
    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
