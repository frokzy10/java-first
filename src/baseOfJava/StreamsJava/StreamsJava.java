package baseOfJava.StreamsJava;

public class StreamsJava {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread threadRunnable = new Thread(new ThreadRunnable(),"Nurdin");
        threadRunnable.start();
    }
}

class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Привет я " + Thread.currentThread().getName());
    }
}

class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("Привет я " + Thread.currentThread());
    }
}
