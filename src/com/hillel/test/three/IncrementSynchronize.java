package com.hillel.test.three;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by A.Zapotochnyy on 28.03.2018.
 */
//Task №3
public class IncrementSynchronize {

    private Lock myLock = new ReentrantLock(false);

    private int value = 0;

    public IncrementSynchronize() {
    }


    public synchronized int getValue1() {
        value++;
        return value;
    }

    public int getValue2() {
        synchronized (this) {
            value++;
            return value;
        }
    }

    public int getValue3() {
        myLock.lock();
        try {
            value++;

        } finally {
            myLock.unlock();
            return value;
        }


    }


}
