
package ngay21_8;


public class BTQT {
    public void ktraMa(String ma){
        String reg="^[Bb]{1}\\d{2}[DCNATPMKQ]{4}\\d{3}$";
        if(ma.matches(reg))
            System.out.println("dung");
        else
            System.out.println("sai");
    }
     public boolean ktraDT(String dt){
        String reg="^0\\d{9}";
        return dt.matches(reg);
    }   
}
