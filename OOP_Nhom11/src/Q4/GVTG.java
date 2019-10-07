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
public class GVTG extends GV{
    private String coquan;
    private double tongluong;

    public GVTG() {
    }

    public GVTG(String coquan, double tongluong) {
        this.coquan = coquan;
        this.tongluong = tongluong;
    }

    public GVTG(String coquan, String ma, String ten, 
            String email, int hocham, int hocvi, String diachi, String sdt, 
            int sogio) {
        super(ma, ten, email, hocham, hocvi, diachi, sdt, sogio);
        this.coquan = coquan;
        
    }

    public String getCoquan() {
        return coquan;
    }

    public void setCoquan(String coquan) {
        this.coquan = coquan;
    }

    public double getTongluong() {
        
        return tongluong;
    }
    public double tinhtongluong(){
        tongluong=super.getSogio()*200;
        return tongluong;
    }
    public void setTongluong(double tongluong) {
        this.tongluong = tongluong;
    }
    public void display() {
        System.out.println(super.getMa()+"\t\t"+super.getTen()+"\t\t"+super.getEmail()
                +"\t\t"+super.inHocHam(super.getHocham())+"\t\t"+super.inHocVi(super.getHocvi())
        +"\t\t"+super.getDiachi()+"\t\t"+super.getSdt()+"\t\t"+super.getSogio()
                +"\t\t"+super.tinhheso(super.getHocham(), super.getHocvi())+"\t\t"+coquan+"\t\t\t\t"+tinhtongluong());
    }
}
