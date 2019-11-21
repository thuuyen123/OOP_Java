/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Begin "+Thread.currentThread().getName());
        for (int i = 0; i < 4; i++) {
            System.out.println("Inside Main");
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
       
      ThreadDemo t = new ThreadDemo("Cooking");
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("Stop Main");
        
        //runable
        RunableDemo r = new RunableDemo();
        Thread t1 = new Thread(r);
        t1.start();
        System.out.println("Stop main");
    }
   
}
