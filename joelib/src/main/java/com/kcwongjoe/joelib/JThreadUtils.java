package com.kcwongjoe.joelib;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * A Utils for thread
 */
public class JThreadUtils {

    // region wait

    /**
     * Wait until mutableBoolean == stopState. It check the <code>mutableBoolean</code> per 0.1s and the timeout was set as 3s.
     * @param mutableBoolean A mutable boolean
     * @param stopState If mutableBoolean == stopState, it is stop to wait.
     * @return Return false if timeout
     * @see com.kcwongjoe.joelib.JThreadUtils#wait(AtomicBoolean, boolean, int, int)
     */
    public static boolean wait(AtomicBoolean mutableBoolean, boolean stopState){
        return wait(mutableBoolean, stopState, 3000, 100);
    }

    /**
     * Wait until mutableBoolean == stopState. It usually use with looper in sync mode.
     * 
     * <pre> {@code
     * boolean stop = false;
     * AtomicBoolean stopped = new AtomicBoolean(false);
     * (new Thread() {
     *     public void run() {
     *         while(!stop){
     *             // do something
     *         }
     *         stopped.set(true);
     *     }
     * }).start();
     * 
     * // Stop the thread in sync mode.
     * stop = true;
     * wait(stop, true, 3000, 100);
     * }</pre>
     *
     * @param mutableBoolean A mutable boolean
     * @param stopState      If mutableBoolean == stopState, it is stop to wait.
     * @param maxWaitMs      Maximum time in millisecond
     * @param delayInMs      Time to be delay per iteration in millisecond
     * @return Return false if timeout
     */
    public static boolean wait(AtomicBoolean mutableBoolean, boolean stopState, int maxWaitMs, int delayInMs) {
        int maxIteration = maxWaitMs * 1000 / delayInMs;

        // Wait
        int iteration = 0;
        while (iteration < maxIteration) {

            // Exit if stopped
            if (mutableBoolean.get() == stopState) {
                break;
            }

            // delay
            delay(delayInMs);

            // Update
            iteration++;
        }

        // Check
        // Time out
        return iteration < maxIteration;
    }

    // endregion wait

    /**
     * Delay. Thread will not sleep.
     *
     * @param ms time to be delay in millisecond
     */
    public static void delay(int ms) {

        // Initialize
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Timer timer = new Timer();

        // countdown after ms
        timer.schedule(new TimerTask() {
                           public void run() {
                               countDownLatch.countDown();
                           }
                       }
                , ms);

        // Wait for countdown
        try {
            countDownLatch.await();
        } catch (InterruptedException ex) {
        }
    }

    /**
     * Sleep the thread
     *
     * @param ms time to be sleep in millisecond
     */
    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
