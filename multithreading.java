public class multithreading {
    public static void main(String[] args) {
        myThread th = new myThread();
        myThread1 th1 = new myThread1();
        System.out.println(Thread.currentThread().getName()); // printing main thread
       //th.start();
        //th1.start();
        
       Myrunnable run1 = new Myrunnable(); // Create a Runnable object
       Thread runThread = new Thread(run1);
       Myrunnable2 run2 = new Myrunnable2(); // Create a Runnable object
       Thread runThread2 = new Thread(run2);
       //runThread.start();
       //runThread2.start();
       threadForLoop tfl = new threadForLoop();
       System.out.println(tfl.getState());
       tfl.start();
       System.out.println(tfl.getState());
       try{
       tfl.sleep(1000);
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
       System.out.println(tfl.getState());
    }
}
// thread creation using thread class thread - 0
class myThread extends Thread {
    public void run(){
      
        System.out.println(Thread.currentThread().getName());
       
    }
}
// thread - 1
class myThread1 extends Thread {
    public void run(){
      
        System.out.println(Thread.currentThread().getName());
       
    }
}

// thread creation using runnable interface
// thread - 2
class Myrunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

//thread 3

class Myrunnable2 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class threadForLoop extends Thread{
    public void run(){
        System.out.println(" current thread name : "+ Thread.currentThread().getName());
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(" value of i : " +i);
        }
    }
}