package multithreading;

public class Waiter implements Runnable{

	private Message msg;
	
	public Waiter(Message msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<100;i++){
			
			
			synchronized (msg) {
				
			   msg.getMessage("Waiter"+i);
			   try {
				   
				msg.wait();
			   } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
				
		}
		
	 	
		
	}

}
