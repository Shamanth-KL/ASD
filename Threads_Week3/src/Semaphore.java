public class Semaphore {


private int semaphore;

public Semaphore() {
        semaphore = 1;
        }

public Semaphore(int initialValue) {
        semaphore = initialValue;
        }

public synchronized boolean waitForSem() {
        if (semaphore > 0) {
        semaphore --;
        return false;
        }
        else return true;
        }

public synchronized void signalSem() {
        semaphore++;
        }

public static void main(String argv[]) {

        Semaphore sem = new Semaphore();

        Writer w1 = new Writer(sem, 1);  // both threads get access to semaphore
        Writer w2 = new Writer(sem, 2);

        w1.start();
        w2.start();

        }  // method main

        } // class Semaphore



class Writer extends Thread {

    int thisThread;
    Semaphore semaphore;

    public Writer(Semaphore s, int thisOne) {
        semaphore = s;
        thisThread = thisOne;
    }  // Constructor Writer

    public void run() {

        while (true) {

            while ( semaphore.waitForSem() );    // busy wait for semaphore access

            System.out.println("Thread " + thisThread +
                    " entering critical section");
            System.out.println("Thread " + thisThread +
                    " leaving critical section");

            semaphore.signalSem();

            try {
                Thread.sleep(2);
            }
            catch(Exception e) {}

        }

    } // method run

} // class Writer