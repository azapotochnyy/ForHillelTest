package com.hillel.test.three;

/**
 * Created by A.Zapotochnyy on 28.03.2018.
 */
public class Start {

    public static void main(String[] args) {

        //Check Synchronize Task№3
        final IncrementSynchronize incrementSynchronize = new IncrementSynchronize();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Thread1 " + incrementSynchronize.getValue1());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Thread2 " + incrementSynchronize.getValue1());
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Thred3 " + incrementSynchronize.getValue1());
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
