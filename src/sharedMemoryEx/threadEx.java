package sharedMemoryEx;

public class threadEx implements Runnable{

    private shareData abc;
    public threadEx(shareData abc){
        this.abc=abc;
    }

    @Override
    public void run() {

        for(int i=0;i<5;i++){

            //reads the value
            System.out.println(abc.getNum() + " " + Thread.currentThread());

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            //update value by one
            abc.updateValueByOne();

            System.out.println(abc.getNum() + " " + Thread.currentThread());






        }

    }
}
