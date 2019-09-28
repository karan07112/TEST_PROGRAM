
public class DuplicateINArray {

	public DuplicateINArray() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String args[]){
		 int a[]={1,2,3,3,5,6};
		 
		 
		 for(int i=0;i<a.length;i++){
			 
			 for(int j=i+1;j<a.length;j++){
				 
				 
				if(a[i]==a[j])
				{
					System.out.println("duplicatr number " + a[i]);
				}
				 
				 
			 }
			 
		 }
		
	}

}
