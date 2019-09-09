/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_18_lkxaunp;

/**
 *
 * @author Thu Uyên
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhiPhan n = new NhiPhan();
        n.nhap();
        try{
            n.Try(1);
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        
    }
}
