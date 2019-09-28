import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CandidateCodeNewYear {

	public CandidateCodeNewYear() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){
		
	
	/*	
		List<String> tokens = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			tokens.add(scanner.next());
		}
		// System.out.println(tokens);
		scanner.close();
		// System.out.println("length" + tokens);
		String[] args = new String[tokens.size()];
		// ArrayList to Array Conversion
		for (int i = 0; i < tokens.size(); i++)
		{	args[i] = tokens.get(i);
		}*/
	
		if(args.length>0){
			
		 int count=Integer.parseInt(args[0]);
		 int j=1;
		 
		 for(int i=0;i<count;i++){
			 if(count==10){
				 break;
			 }
				 
			   int num=Integer.parseInt(args[j++]);
			   
			   int[] arr = new int[num];
			   for(int y=0;y<num;y++,j++){
				arr[y]=Integer.parseInt(args[j]);
				
				}
			   
		     for(int v:arr){
		    	// System.out.print(v);
		     }
		 	
		     String returnStr="";
		     int temp=-1000;
		     HashMap<String,String> map=new HashMap<String,String>();
		     
		     for(int l=0;l<arr.length;){
		     int val1=arr[l];
		     if(val1>temp){
	    		 temp=val1;
	    		 returnStr=temp+"";
	    	 }else{
	    		 
	    	 }
		     
		     
		     
		   if(val1>0){            
		     if(l<arr.length-1){
		    	 
		     int temp2=l+2;
		     for(int m=temp2;m<arr.length;m++){
		    	 int val2=arr[m];  
		    	 if(val2>0){
		    	 if((val1+val2)==temp){
		    	if(map.containsKey(temp))
		    	{
		        String res=map.get(temp);
		    	String resA[]= res.split(",");
		    	  if(val1>Integer.parseInt(resA[0])){
		    		 returnStr=val2+""+val1+"";
		    	  }else{
		    		 returnStr=res;
		    	  }
		    	}
		     } else if((val1+val2)>temp || val1 > temp ){
		   		 temp=val1+val2;
		   		 if(map.containsKey(temp)){
		   			 map.replace(temp+"", val2+","+val1);
		   		 }else{
		   			 map.put(temp+"", val1+","+val2);
		   		 }
		   		 returnStr=val2+""+val1+"";
		    	 if(val1>temp){
		    		 temp=val1;
		    		 if(map.containsKey(temp)){
			   			 map.replace(temp+"", val1+",");
			   		 }else{
			   			 map.put(temp+"", val1+",");
			   		 }
		    	 }
		   	  }
		  
		  }
		    	// System.out.println(map);
		      }
		  
			    
		      }
	    }  
		     }
		     System.out.println(returnStr.trim());
		    }
		
				 
			 }
			 
			
		 }
		 
}


	


