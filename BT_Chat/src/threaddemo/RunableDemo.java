/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author ADMIN
 */
public class RunableDemo implements Runnable{
    private int index;
    public void run(){
        System.out.println("start Runable");
        for (int i = 0; i < 8; i++) {
            System.out.println("inside Runable "+(index++));
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("The end Runable");
    }
}
