
public class duplicate {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String str1="karan124";
		
		System.out.println(str1.hashCode());
		
		String str="Hii Naveep this is nevdeep",news = "";
		char pre = 0;
		for(int i=0;i<=str.length()-1;i++){
		if(pre!=str.charAt(i)){
					news+=str.charAt(i);
				}
				pre=str.charAt(i);
			}
			
			
		
		
		
		System.out.println(news);
	}

}
