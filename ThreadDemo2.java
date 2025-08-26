public class ThreadDemo2 extends Thread {
    public void run(){
       for(int i=0;i<5;i++){
           System.out.println(Thread.currentThread().getName()+" : "+i);
       }
    }

    public static void main(String args[]){
        ThreadDemo2 t2 = new ThreadDemo2();
        t2.start();
       // System.out.println("Inside main thread");
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }

}
