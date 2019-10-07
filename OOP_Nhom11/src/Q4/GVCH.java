/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

/**
 *
 * @author Admin
 */
public class GVCH extends GV{
    private double luongcung;
    private int sogioquydinh;
    private double tongluong;

    public GVCH() {
    }

    public GVCH(double luongcung, int sogioquydinh) {
        this.luongcung = luongcung;
        this.sogioquydinh = sogioquydinh;
    }

    public GVCH(double luongcung, int sogioquydinh, String ma, String ten, String email,
            int hocham, int hocvi, String diachi, String sdt, int sogio) {
        super(ma, ten, email, hocham, hocvi, diachi, sdt, sogio);
        this.luongcung = luongcung;
        this.sogioquydinh = sogioquydinh;
       
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }

    public int getSogioquydinh() {
        return sogioquydinh;
    }

    public void setSogioquydinh(int sogioquydinh) {
        this.sogioquydinh = sogioquydinh;
    }

    public double getTongluong() {
        return tongluong;
    }

    public void setTongluong(double tongluong) {
        this.tongluong = tongluong;
    }
    @Override
    public double tinhtongluong(){
        tongluong=luongcung*super.tinhheso(super.getHocham(),super.getHocvi())+((super.getSogio()-sogioquydinh)*50);
        return tongluong;
    }
    @Override
    public void display() {
        System.out.println(super.getMa()+"\t\t"+super.getTen()+"\t\t"+super.getEmail()
                +"\t\t"+super.inHocHam(super.getHocham())+"\t\t"+super.inHocVi(super.getHocvi())
        +"\t\t"+super.getDiachi()+"\t\t"+super.getSdt()+"\t\t"+super.getSogio()
                +"\t\t"+super.tinhheso(super.getHocham(),super.getHocvi())+"\t\t"+luongcung+"\t\t"+sogioquydinh+"\t\t"+tinhtongluong());
    }
        
        
}
