class MyThread extends Thread{

    static Thread mt;
    public void run(){
        try {
            mt.join();
        } catch (InterruptedException e) {
        
            e.printStackTrace();
        }
        
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
            
        }
    }
}
public class JoinMethodExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        MyThread.mt = Thread.currentThread();
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
            
        }
    }
    
}
