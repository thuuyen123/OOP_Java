package bai7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlRegex {
    public static void main(String[] args) {
        String url = "http://tiki.vn//dien-thoai-may-tinh/c1788?src=mega-menu";
        String url2 = "https://www.r122egextester.com/93652";
        String url3 = "https://www.youtube.com/?utm_source=directory&utm_campaign=CoccocAds&utm_medium=CoccocBrowser";

//        Pattern pr = Pattern.compile("^https?:\\/\\/(www\\.)?\\w+(\\.[a-z]{2,6})+(\\/\\/?[^\\s]*)?");
//        Matcher matcher = pr.matcher(url2);
//
//        if(matcher.matches()) System.out.println("true");
//        else System.out.println("false");



        String ci = "Country{code=COD, name=Congo, The Democratic Republic of the, continent=Africa, surfaceArea=2344858.0, population=51654000, gnp=6964.0, capital=2298}";
        Pattern pr = Pattern.compile("^Country\\{code=(\\w+), name=(.*), continent=([a-zA-Z]+), surfaceArea=(\\d+\\.?\\d+), population=(\\d+), gnp=(\\d+\\.?\\d+), capital=(\\d+)}");
        Matcher m = pr.matcher(ci);

//        if(m.matches()) System.out.println("true");
//        else System.out.println("fa");
       if (m.find()){
           System.out.println(m.group(1));
           System.out.println(m.group(2));
           System.out.println(m.group(3));
           System.out.println(m.group(4));
           System.out.println(m.group(5));
           System.out.println(m.group(6));
           System.out.println(m.group(7));

       }
       else {
           System.out.println("ngu si");
       }



//        String line = "Vietjack xin chao cac ban. Day la vi du ve Regex! 1000  0USD";
//        String pattern = "(.*)(\\d+)(.*)";
//
//        // Tao mot doi tuong Pattern
//        Pattern r = Pattern.compile(pattern);
//
//        // Tao doi tuong matcher.
//        Matcher m = r.matcher(line);
//        if (m.find( )) {
//            System.out.println("Gia tri duoc tim thay la: " + m.group(0) );
//            System.out.println("Gia tri duoc tim thay la: " + m.group(1) );
//            System.out.println("Gia tri duoc tim thay la: " + m.group(2) );
//        } else {
//            System.out.println("Khong co ket noi");
//        }
    }
}
