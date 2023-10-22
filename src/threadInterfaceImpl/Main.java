package threadInterfaceImpl;

public class Main {

    public static void main(String[] args) {

        //  thread2 th=new thread2();
        //above line will not nmake it thread
        //in runnable case we have different way of doing
        //because how you will call start() method to invoke a thread???

        Thread t=new Thread(new thread2(),"sammy");
        t.start();
    }
}
