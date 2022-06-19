package com.learning.thread;

public class SyncThread extends Thread {
    private final NumberGenerator ng;

    public SyncThread(NumberGenerator ng) {
        this.ng = ng;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        callGenerator();
    }

    private void callGenerator(){
        synchronized (ng){
            for(int i = 0; i<3;i++){
                System.out.println(getName() + " " + ng.randomNumber());
            }
        }
    }
}
