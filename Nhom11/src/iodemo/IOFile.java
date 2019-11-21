/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iodemo;
//doc ra
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//viet vao
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Thu Uyên
 */
public class IOFile {
    public static void vietFile(List list, String s) {
        try {
            ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream(s));
            for (Object o : list) {
                w.writeObject(o);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    public static void docFile(List ob, String s) {
        try {
            ObjectInputStream r = new ObjectInputStream(new FileInputStream(s));
            Object o;
            while((o=r.readObject())!=null){
                Object o1 = (Object) o;
                ob.add(o);
            }
            r.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
