package demo;

public class thread  extends Thread {
	
	
	 class thread1  extends Thread {

		public static final String name1="karan";
			
			
			public void run()
			{
				System.out.println("Thread two started");
			}
			
		
			
		}

public static String name="karan";
	
	int  i=0;
	public void run()
	{
		System.out.println("Thread one started");
		
		while(i<10000){
			try {
				thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(i++);
		}
	}
	
	
	
	public static void  main(String[] arg){
		System.out.println("this is main method");
		thread th1=new thread();
		th1.start();
		
		thread1 th2=th1.new thread1();
		th2.setPriority(10);
		th2.start();
		
		
	}
	
	

}



