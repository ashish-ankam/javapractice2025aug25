/*
 * This is a simple implementation of the Runnable interface.
 * Here to start the Thread , used Thread Constructor which takes a Runnable object.
 */

package codepractice;

public class MyRunnable implements Runnable
{
    @Override
    public void run() {
        System.out.println("Hello from MyRunnable!");
    }

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
