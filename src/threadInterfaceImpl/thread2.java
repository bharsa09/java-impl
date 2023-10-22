package threadInterfaceImpl;

public class thread2 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<7;i++){
            System.out.println("inside thread1-->" + i + Thread.currentThread());
        }
        System.out.println();
    }
}
