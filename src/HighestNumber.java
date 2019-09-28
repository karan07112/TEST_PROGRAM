import java.util.Collections;


public class HighestNumber {

	public HighestNumber() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]){
		
        int a[]={200,45,3,67,90,100,78,32,101,-2147489 };
       	
		int highestNumF,highestNumS,highestNumT;
		 
		highestNumF=highestNumS=highestNumT=Integer.MIN_VALUE;	
		
		
		for(int i=0;i<a.length;i++){
			if(a[i]>highestNumF){
				highestNumT=highestNumS;
				highestNumS=highestNumF;
				highestNumF=a[i];
			}else if(a[i]>highestNumS){
				highestNumT=highestNumS;
				highestNumS=a[i];
			}else if(a[i]>highestNumT){
				highestNumT=a[i];
			}
		}
		
		System.out.println("Highest F Number is " + highestNumF);
		System.out.println("Highest S Number is " + highestNumS);
		System.out.println("Highest T Number is " + highestNumT);
		
		System.out.println();
		
	}

}
