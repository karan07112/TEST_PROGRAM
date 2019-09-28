package multithreading;

public class MyThread extends Thread {

	
	private String name;
	
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	
	public MyThread(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
			Thread.currentThread().setName(name);
			System.out.println(Thread.currentThread().getName()+"==>"+ i);
			try {
				Thread.currentThread().sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		}
	
	

}
