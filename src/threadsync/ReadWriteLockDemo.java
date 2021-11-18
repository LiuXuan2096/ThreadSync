package threadsync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


class ReadWriteLockDemo implements TestDemo {
    private int x = 0;
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    Lock readLock = lock.readLock();
    Lock wirteLock = lock.writeLock();

    private void count() {
        wirteLock.lock();
        try {
            x++;
        } finally {
            wirteLock.unlock();
        }
    }

    private void print() {
        readLock.lock();
        try {
            System.out.println(x + " ");
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public void runTest() {
        count();
        print();
        count();
        print();
    }
}
