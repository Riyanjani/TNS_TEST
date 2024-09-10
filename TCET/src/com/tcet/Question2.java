package com.tcet;
class Tnstest implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        Thread question2Thread = new Thread(new Tnstest());
        question2Thread.start();
    }
}
