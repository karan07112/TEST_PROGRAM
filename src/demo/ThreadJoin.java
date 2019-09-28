package demo;

public class ThreadJoin  extends Thread {

	public void run(){
		
		
		
		
		System.out.println("ssss");
		try {
		System.out.println(	Thread.currentThread());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String args[]){
		
		ThreadJoin tj1=new ThreadJoin();
		tj1.setName("tj1");
		ThreadJoin tj2=new ThreadJoin();
		tj2.setName("tj2");
		ThreadJoin tj3=new ThreadJoin();
		tj3.setName("tj3");
		ThreadJoin tj4=new ThreadJoin();
		tj4.setName("tj4");
		tj1.start();
		tj2.start();
		tj3.start();
		try {
			tj3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj4.start();
	}
	
	
}
