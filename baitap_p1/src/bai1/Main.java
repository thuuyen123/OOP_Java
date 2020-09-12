package bai1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void ramSet(Set<Integer> a,Set<Integer> other,Set<Integer> other2, int limit){
        Random rd = new Random();

        while (a.size()<limit){
            int temp = rd.nextInt(Integer.MAX_VALUE);
            int x = rd.nextInt( 1)+1;
            if(x==1) x = temp;
            else  x = -temp;
            if(!a.contains(x) && !other.contains(x) && !other2.contains(x)){
                a.add(x);
            }
        }
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> settemp = new HashSet<>();
        long timestart = System.currentTimeMillis();

        ramSet(settemp,set1,set2, 2000000*5/100);
        int num = 2000000*95/100;
        do{
            set1.clear();
            set2.clear();
            ramSet(set1, settemp,set2, num);
            ramSet(set2,settemp,set1, num);
            set1.addAll(settemp);
            set2.addAll(settemp);
            System.out.println(set1.size());
            System.out.println(set2.size());

        }while(set1.size() < 2000000 || set2.size() < 2000000 );


        Set<Integer> set1copy = new HashSet<>();
        set1copy.addAll(set1);
        set1copy.retainAll(set2);

        set1.addAll(set2);

        long timefinish = System.currentTimeMillis();

        System.out.println("Giay thuc thi: " + (timefinish-timestart));

        Iterator<Integer> intersection = set1copy.iterator();
        while (intersection.hasNext()){
            System.out.println( intersection.next());
        }

        System.out.println(set1copy.size());
    }
}
