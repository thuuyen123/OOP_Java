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
public class SinhVien implements DenTruong {
    private String hoten;

    @Override
    public void mangGi() {
        System.out.println("sach");
        System.out.println("may tinh");
        System.out.println("linh tinh");
    }

    @Override
    public double soTien() {
        return 50000;
    }

    @Override
    public void dibangGi() {
        System.out.println("xe may");
        System.out.println("xe bus neu khong co xe may");
    }
    
}
