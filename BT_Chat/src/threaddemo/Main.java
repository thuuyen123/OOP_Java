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
public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main");
        for (int i = 0; i < 3; i++) {
            System.out.println("inside Main");
            try{
                Thread.sleep(400);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        //run Thread
        ThreadDemo t=new ThreadDemo("Cooking");
       // t.setDaemon(true);
        t.start();
        try{
          t.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        //run Runnable
        RunableDemo r=new RunableDemo();
        Thread t1=new Thread(r);
        t1.start();
        
        System.out.println("Stop main");
    }
    
}
