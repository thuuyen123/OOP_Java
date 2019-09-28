/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom11_vd3;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    public static void main(String[] args) {
        AbstractDemo a = new Demo1(56);
        a.setName("Hoa");
        System.out.println(a.getName());
        System.out.println(a.getValue());
        DinhGia d = new DinhGia() {// anonymous class
            @Override
            public void doTincay() {
                System.out.println("rat cao");
            }

            @Override
            public double getGiaTri() {
               return 5000000;
            }
        };
        d.getGiaTri();
        System.out.println("");
        
    }
}
