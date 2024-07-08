package com.example.task2;

public class BallThread extends Thread {
    private final Ball b;

    public BallThread(Ball ball) {
        b = ball;
    }

    @Override
    public void run() {
        final int iterationsCount = 10000;
        final int sleepTime = 5;

        try {
            for (int i = 1; i < iterationsCount; i++) {
                if (b.isInPocket()) {
                    return;
                }

                b.move();
                System.out.println("Thread name = " + Thread.currentThread().getName());
                Thread.sleep(sleepTime);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
