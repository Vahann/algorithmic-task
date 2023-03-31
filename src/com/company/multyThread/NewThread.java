package com.company.multyThread;

public class NewThread implements Runnable{
    Thread t;

    public NewThread(){
        t= new Thread(this,"Demo thread");
        System.out.println("Create demoThread "+t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("child thread "+i+ Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
