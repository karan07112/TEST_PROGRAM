import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


public class CandidateCodeNewYearSec {

	public CandidateCodeNewYearSec() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String args[]){
		
		int array[]={2 ,0 ,5 ,7 ,-1 ,0 ,8, 4, 1, 3 ,-2 ,0 ,0 ,2, -2};
		
		System.out.println(FindMaxSumString(array,array.length));
		
		System.out.println(FindMaxSum(array,array.length));
		
/*		if(args.length>0){
			
	    int testCases=Integer.parseInt(args[0]);
	    int j=1;
    	
	    for(int i=0;i<testCases;i++){   // loop will continue upto test cases enterted
	  
	    	 int numOfHouses=Integer.parseInt(args[j++]);
	         int houseArray[]=new int[numOfHouses];
	    	 for(int k=0;k<numOfHouses;k++,j++){
	    		 houseArray[k]=Integer.parseInt(args[j]);
	    		}
	    	  int temp=-1000;
	    	  int tempFinal=-2147483648;
	    	   String maxStrList="";
    	       
	    	 HashMap<String,String> map=new HashMap<String,String>();
	    	 
	    	 tempFinal=FindMaxSum(houseArray,houseArray.length);
	    	 maxStrList=FindMaxSumString(houseArray,houseArray.length);
	    	      
	         
		   
		    	  map.put(maxStrList+"",tempFinal+""); 
		   
	    	      
	    	 
	    	 
	     	 for(int l=0;l<numOfHouses;l++){         // first loop
	     		      temp=-1000;
	  	    	
	     	          String maxStrList="";
	 	    	      int val1=houseArray[l];
	 	    	      if(val1>temp){
	    			  temp=val1;
	    			  maxStrList=val1+"";
	    		           }
	 	    	      
	 	    	     for(int r=0;r>l;r++){   //inner loop
		    		      int val2=houseArray[r];
		    		      if(val2>0){   // checking whether value greater than 0 or negative
		    		    	   r++;
		    			
		    		         temp=temp+val2;
		    		         maxStrList=maxStrList+","+val2+"";
		    			   }
		    		      
		    		      
		    	      }  
	 	    	     
	    		   for(int m=l+2;m<numOfHouses;m++){   //inner loop
	    		      int val2=houseArray[m];
	    		      if(val2>0){   // checking whether value greater than 0 or negative
	    		    	   m++;
	    			  
	    		         temp=temp+val2;
	    		         maxStrList=maxStrList+","+val2+"";
	    			   }
	    		      
	    		      
	    	      }  
	    		  
	    		
	    		      
	    		   if(tempFinal<temp){
	    			   tempFinal=temp;
	    		   }
	    		      
	    		     if(map.containsKey(maxStrList)){
	    		    	  String str=map.get(temp+"");
	    		    	  map.replace(maxStrList,temp+""); 
		    		 }else{
	    		    	  map.put(maxStrList+"",temp+""); 
	    		     }
	    		 
	   }
    
	 System.out.println(map);
    //	 System.out.println("tempFinal"+tempFinal);
	     Set<Entry<String, String>> entry=map.entrySet();
	     List<String>  list=new ArrayList<String>();
 	     for(Entry<String, String> e:entry){
	     if(e.getValue().equalsIgnoreCase(tempFinal+"")){
	    	String maxList=e.getKey();
	    	list.add(maxList);
	       }
	    }
 	    
 	     int p=-1000;
 	     String finalStr="";
 	    // System.out.println("listSize" + list);
 	     int intminValue=Integer.MIN_VALUE;
	     for(String str:list){
 	      if(str.contains(",")){
 	    		String[] strArry=str.split(",");
 	    	//	System.out.println(intminValue);
 	    		if(Integer.parseInt(strArry[strArry.length-1])>intminValue){
 		    		for(int n=strArry.length-1;n>=0;n--){
 	 		    		finalStr+=strArry[n];
 	 		    	 }
 	    			intminValue=Integer.parseInt(strArry[strArry.length-1]);
 	    		}
 	    		
 	    	}else{
 	    		finalStr=str;
 	    	}
 	     }

 	    System.out.println(finalStr);      
	  	    	 
 }
			
			
			
			
}else{
     System.out.println("No input parameters");
}
	*/	
		
		
}
	
	public static int FindMaxSum(int arr[], int n) 
	    { 
	        int incl = arr[0]; 
	        int excl = 0; 
	        int excl_new; 
	        int i; 
	  
	        for (i = 1; i < n; i++) 
	        { 
	            /* current max excluding i */
	            excl_new = (incl > excl) ? incl : excl; 
	  
	            /* current max including i */
	            incl = excl + arr[i]; 
	            excl = excl_new; 
	        } 
	  
	        /* return max of incl and excl */
	        return ((incl > excl) ? incl : excl); 
	    } 
	
	public static String FindMaxSumString(int arr[], int n) 
    { 
		
		String maxStr="";
        int incl = arr[0]; 
        int excl = 0; 
        int excl_new; 
        int i; 
  
        for (i = 1; i < n; i++) 
        { 
            /* current max excluding i */
          //  excl_new = (incl > excl) ? incl : excl; 
            
            if(incl > excl)
            	excl_new=incl;
            else{
            	excl_new=excl;
            }
  
            /* current max including i */
            incl = excl + arr[i]; 
            maxStr+=excl_new+",";
            excl = excl_new; 
        } 
  
        /* return max of incl and excl */
        return maxStr; 
    } 
	
}
