package uz.urinov.embarkxjobproject;

public class Main {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        myThread.start();
        for (int i = 0; i < 5; i++) {

            System.out.println("Main");
            Thread.yield();
        }



    }

}

class MyThread extends Thread{
    @Override
    public void run() {

        System.out.println("MyThread");
    }
}
