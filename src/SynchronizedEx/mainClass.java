package SynchronizedEx;

public class mainClass {
    public static void main(String[] args) {
        syncClass abc=new syncClass();

        //under this lambda function the method code will be copied in run() method by compiler
        //this is equivalent to
        /*---> Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.synchronizedMethod();
            }
        }); <--- */

        Thread th1=new Thread(()->{
            abc.syncMethod();
        },"th1");

        Thread th2=new Thread(()->{
            abc.syncMethod();
        },"th2");


        th1.start();
        th2.start();
    }
}
