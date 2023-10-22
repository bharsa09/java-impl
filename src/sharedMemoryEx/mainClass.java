package sharedMemoryEx;

public class mainClass {

    public static void main(String[] args) {
        shareData abc=new shareData(0);

        threadEx th1=new threadEx(abc);
        threadEx th2=new threadEx(abc);

        Thread t1=new Thread(th1,"sam1");
        Thread t2=new Thread(th2,"sam2");

        t1.start();
        t2.start();
    }
}
