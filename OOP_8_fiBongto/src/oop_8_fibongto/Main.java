/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_8_fibongto;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    public static void main(String[] args) {
        Fibo_Ngto fn = new Fibo_Ngto();
        fn.nhap();
        System.out.println(" các số Fibonaci nhỏ hơn n là số nguyên tố là: ");
        fn.fiBo_ngTo();
        System.out.println("");
    }
    
}
