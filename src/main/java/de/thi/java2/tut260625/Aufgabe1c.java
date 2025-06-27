package de.thi.java2.tut260625;


public class Aufgabe1c extends Thread {

    public boolean isStopped = false;

    @Override
    public void run() {
        for (int i = 0; i < 1000; ++i) {
            if (isStopped) {
                break;
            }
            System.out.println("i=" + i);
        }
    }

    public void stopThread() {
        isStopped = true;
    }


    public static void main(String[] args) {
        Aufgabe1c a = new Aufgabe1c();
        a.start();
        a.stopThread();
    }
}
