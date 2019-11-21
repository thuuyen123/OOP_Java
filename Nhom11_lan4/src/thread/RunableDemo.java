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
public class RunableDemo implements Runnable{
    private int index = 0;
    @Override
    public void run(){
        System.out.println("Start Runable");
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside runable "+ index++);
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("The end runable");
    }
}
