package threads;


public class TestThread {

    public static void main(String[] args) {
        SampleThread sampleThread = new SampleThread();
        Thread myThread = new Thread(sampleThread, "Thread1");
        Thread myThread2 = new Thread(sampleThread, "Thread2");
        Thread myThread3 = new Thread(sampleThread, "Thread3");

        myThread.start();
        myThread2.start();
        myThread3.start();
    }
}
