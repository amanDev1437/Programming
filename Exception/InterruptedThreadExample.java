class MyThread1 extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("I am lazy Thread");
                
            }
        }finally{
            System.out.println("I got Interrupted");
        }
    }
}

public class InterruptedThreadExample {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();
        t.interrupt();
        System.out.println("Mains ends");
    }
    
}
