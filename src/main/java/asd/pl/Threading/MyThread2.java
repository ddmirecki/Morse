package asd.pl.Threading;

/**
 * Created by RENT on 2017-01-14.
 */
public class MyThread2 extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }
}
