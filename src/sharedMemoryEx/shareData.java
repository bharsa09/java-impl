package sharedMemoryEx;

public class shareData {
    private int num;

    //Thread t=Thread.currentThread();

    //constructor does not have return type but if you see it returns class reference
    //this keyword is used to get access of it


        public shareData( int num){
            this.num = num;
        }

        public int getNum () {
            return num;
        }

        public void updateValueByOne () {
            num++;
            System.out.println("this value update by thread ----> " + Thread.currentThread());
        }





}
