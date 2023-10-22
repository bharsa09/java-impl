package SynchronizedEx;

public class syncClass {

    //create an object to act as a lock for synchronization

    /*
    * it is used to provide mutual exclusion and prevent multiple thread from concurrently executing the sync block
    * one thread can access the critical section of code at a time
    * data integrity, race condition prevention,thread safety,orderly execution
    *prevention of concurrent access to the critical code
    * */
    private Object lock=new Object();

    private int sharedValue=0;

    public void syncMethod(){
        synchronized (lock){
            for(int i=0;i<5;i++){
                sharedValue++;
                System.out.println("Thread-->"+Thread.currentThread());
            }
        }
    }
}
