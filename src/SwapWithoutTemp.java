
public class SwapWithoutTemp {

	public SwapWithoutTemp() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String args[]){
		
		
		// **************swap without temp ************
        int  i=20,j=40;
		i=i+j;
	    j=i-j;
	    i=i-j;
	    System.out.println("i :"+ i +"j:"+ j);
	    
	    
	    
	 //   ******************Find substring in string************
	    
	    String str="karan";
	    String sentance="hello karan how are you  , m,  ";
	     String[] strArry=sentance.split(" ");
	    int count=0;
	    for(String s:strArry){
	    	if(s.equals(str)){
	    		count++;
	    		System.out.println("String found " + s  + "c" + count);
	    	}
	    }
	    
	    // ****************Fibonaci series *********************
	    
	    fibonacci(100);
	    
	    
      }
	
	static int val = 0,sum;
	static int first=0,second=1;
	
	public static void fibonacci(int num){
		
		if(num==0 && num==1)
		{	
		System.out.println(first +","+ second);
		
		}else{
			
			  
			sum=first+second;
			
			    second=sum;
			    sum=sum+second;
				System.out.print(sum+" ,");
		  }
		
		
		if(num>sum){
			
		
			fibonacci(num);
			
		}		
		 
		
		
	   
		
	}
	
	
}
