public class Example {
    public static void main(String[] args) throws InterruptedException {
        A.s = Thread.currentThread(); // Assign the main thread to 's'
        A a = new A(); // Create an instance of class A (child thread)
        System.out.println("Program Started...");
        a.start(); // Start the child thread
        Thread.sleep(10000); // Sleep the main thread for 10 seconds

        System.out.println("Program ended");
    }
}
