package demo;

class MyRunnable1 implements Runnable{
	 
    @Override
    public void run(){
                  method1();
                  method2();
    }
 
    synchronized void method1(){
           System.out.println(Thread.currentThread().getName()
                        +" in synchronized void method1() started");
           try {
                  Thread.sleep(2000);
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
           System.out.println(Thread.currentThread().getName()
                        +" in synchronized void method1() ended");
    }
    
    synchronized void method2(){
           System.out.println(Thread.currentThread().getName()
                        +" in synchronized void method2() started");
           try {
                  Thread.sleep(2000);
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
           System.out.println(Thread.currentThread().getName()+
                        " in synchronized void method2() ended");
    }
    
}