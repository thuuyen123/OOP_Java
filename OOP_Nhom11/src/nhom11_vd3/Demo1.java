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
public class Demo1 extends AbstractDemo implements DiHoc,DinhGia{
    private int value;
    public Demo1(){
    
    }
    public Demo1(int value){
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void write(String name) {
        System.out.println("Hello " + name);
    }

    @Override
    public void mangGi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int soTien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void diBangGi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doTincay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getGiaTri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
