package bai4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main4 {

    public void randomPoint(Set<Point> s1, Set<Point> s2,Set<Point> s3, Point o ,int limitdis, int sizeNum){
        Random rd = new Random();
        while(s1.size() < sizeNum){
            Point x = new Point();
            x.setX(rd.nextInt(2*limitdis)+o.getX()-limitdis);
            x.setY(rd.nextInt(2*limitdis)+o.getY()-limitdis);
            if(!s1.contains(x) && !s2.contains(x) && !s3.contains(x)){
                if(x.ckeckdistance(x,o,limitdis)){
                    s1.add(x);
                    System.out.println(x);
                }
            }
        }

    }
    public static void main(String[] args) {
        Main4 main4 = new Main4();

        Set<Point> set1 = new HashSet<>();
        Set<Point> set2 = new HashSet<>();
        Set<Point> set3 = new HashSet<>();

        Point a = new Point(800,800);
        Point b = new Point(4000, 800);
        Point c = new Point(2400, 2400);

        int limitA = 400;
        int limitB = 500;
        int limitC = 600;

        int size1 = 8000;
        int size2 = 10000;
        int size3 = 12000;

        main4.randomPoint(set1, set2, set3,a , limitA, size1);
        main4.randomPoint(set2, set1, set3,b, limitB, size2);
        main4.randomPoint(set3, set1, set2,c, limitC, size3);

        Set<Point> sum = new HashSet<>();
        sum.addAll(set1);
        sum.addAll(set2);
        sum.addAll(set3);
        System.out.println(sum.size());
        List<Point> list = new ArrayList<>();
        list.addAll(sum);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("src/bai4/output.txt"));
            for (int i = 0; i < list.size(); i++) {
                pw.write(list.get(i).toString());
                pw.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            pw.close();
        }


    }
}
