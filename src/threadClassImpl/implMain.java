package threadClassImpl;

public class implMain {

    public static void main(String[] args) {
        Thread t=Thread.currentThread();

        System.out.println("---this is main thread---" + t);

        thread1 th=new thread1("sameerThread");
        try {
            t.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th.start();



        System.out.println("---main thread execution ended---" + t);


    }
}
