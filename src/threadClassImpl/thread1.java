package threadClassImpl;

public class thread1 extends Thread{


    public thread1(String s){
        //this will set thread name
        super(s);
    }

    @Override
    public void run() {
        for (int i=0;i<7;i++){
            System.out.println("inside thread1-->" + i + Thread.currentThread());
        }
        System.out.println();
    }
}
