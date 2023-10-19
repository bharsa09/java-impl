class A extends Thread {
    static Thread s;

    public void run() {
        System.out.println("This is the child thread");
        try {
            s.join(); // Waits for the main thread (s) to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The child thread ended after the main thread stopped");
    }
}

