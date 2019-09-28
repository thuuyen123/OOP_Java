/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astractclass;

/**
 *
 * @author ADMIN
 */
public class Main1 {
    public static void main(String[] args) {
        DenTruong dt=new DenTruong() {
            @Override
            public void mangGi() {
                System.out.println("sach");
            }

            @Override
            public double soTien() {
                return 50000;
            }

            @Override
            public void dibangGi() {
                System.out.println("xe may");
            }
        };
        dt.mangGi();
        dt.dibangGi();
        System.out.println(dt.soTien());
    }
    
    
}
