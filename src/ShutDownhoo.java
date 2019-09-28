public class ShutDownhoo {

public class thr extends Thread{
	
	public void run(){
		
		System.out.println("this is run method of thr class");
	}
	
	
}

public static void main(String args[]){
		
		Runtime rn=Runtime.getRuntime();
		rn.addShutdownHook(new Thread(){
			public void run(){
				System.out.println("sssssssssss");
			}
		});
		
		
		System.out.println("Main>>");
		
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}


