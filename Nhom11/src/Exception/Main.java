
package Exception;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//loi runtime
// nullpoit: khi chua khoi tao
// 
public class Main {
    public static void main(String[] args) {
//        int x, y,z;
//        x = 10;
//        y =0;
//        try{ 
//        z = x/y;
//        System.out.println("z = "+z);
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        }
//        System.out.println("Viec 2");
//        System.out.println("Viec 3");

           try{
           String num = "add";
           int n = Integer.parseInt(num);//chay chtr moi thay co loi ==> Unchecked
           }catch(NumberFormatException e){
               System.out.println(e);
           }
           String date = "09/10/1999";
           SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
           try{
                Date d = f.parse(date);//check exception ==> luoon luon cai try catch
                System.out.println(d);
           }catch(ParseException e){
               System.out.println(e);
           }
    
    }
}
