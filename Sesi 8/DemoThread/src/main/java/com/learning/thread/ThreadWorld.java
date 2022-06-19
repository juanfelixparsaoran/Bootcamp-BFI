package com.learning.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadWorld extends Thread{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(getName() + ": Hello");
        try{
            Thread.sleep(250);
        } catch(InterruptedException ex){
            Logger.getLogger(getName()).log(Level.SEVERE, null, ex);
        }
    }
}
