package demo;

class TestJoinMethod2 implements Runnable {  
	
	public static void main(String args[]){  
		
	 TestJoinMethod2 tc1=new TestJoinMethod2();  
	 TestJoinMethod2 tc2=new TestJoinMethod2();  
	 TestJoinMethod2 tc3=new TestJoinMethod2();  
	 
	 Thread t1=new Thread(tc1);
	 Thread t2=new Thread(tc2);
	 Thread t3=new Thread(tc3);
	 
	 t1.start();  
	 t2.start(); 
	 try{  
	  t1.join();  
	 }catch(Exception e){System.out.println(e);}  
	  
	 
	 t3.start();  
	 }
	
	
	 public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
		    Thread.sleep(500);  
		   }catch(Exception e){System.out.println(e);}  
		  System.out.println(i);  
		  }  
		 }    
	}  