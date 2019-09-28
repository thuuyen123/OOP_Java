
package classdemo;


public class Sach extends TaiLieu{
    //Tên tác giả, Tên sách, số trang
    private String tentg,tens;
    private int strang;
    public Sach(){}
    public Sach(String ma,String tens,String tentg,
            String tennxb, int strang,int sobanph){
        super(ma, tennxb, sobanph);
        this.tens=tens;
        this.tentg=this.tentg;
        this.strang=strang;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public String getTens() {
        return tens;
    }

    public void setTens(String tens) {
        this.tens = tens;
    }

    public int getStrang() {
        return strang;
    }

    public void setStrang(int strang) {
        this.strang = strang;
    }
    public String toString(){
      return super.getMa()+"\t"+tens+"\t"+tentg+"\t"+
      super.getTennxb()+"\t"+strang+"\t"+super.getSobanph();
    }
}
