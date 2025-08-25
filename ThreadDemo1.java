public class ThreadDemo1 extends Thread{
    public void run(){
        System.out.println("Inside child thread");
        System.out.println("overriden run method");
    }

    public static void main(String args[]){
        ThreadDemo1 t1 = new ThreadDemo1();
        t1.start();
        System.out.println("Inside main thread");
        
    }
}
