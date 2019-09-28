package multithreading;

public class Notify implements Runnable {

	private Message msg;
	
	public Notify(Message msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (msg) {
		for(int i=0;i<100;i++){
			
			   msg.getMessage("Notifier"+i);
					
		}
		
		msg.notify();
		}
		
	}

}
