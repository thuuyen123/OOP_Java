
package Q3;

/**
 *
 * @author Admin
 */
public class TapChi extends TaiLieu{
    private int soPH, thangPH;

    public TapChi() {
    }

    public TapChi(int soPH, int thangPH) {
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public TapChi(int soPH, int thangPH, String ma, String tenNXB, int soBPH) {
        super(ma, tenNXB, soBPH);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }


    @Override
    public String toString(){
        return super.getMa() +"\t"+ super.getTenNXB()+"\t"+super.getSoBPH()+"\t"+soPH +"\t"+ thangPH ;
    }
}
