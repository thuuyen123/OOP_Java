
package iodemo;
//doc
import java.io.ObjectInputStream;
import java.io.FileInputStream;
//viet
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class IOFile {
    public static void vietFile(List ob,String s){
        try{    
            ObjectOutputStream w=
                  new ObjectOutputStream(new 
                  FileOutputStream(s));
            for(Object o:ob)
                w.writeObject(o);
            w.close();
        }catch(IOException e){
            System.out.println(e);
        }    
    }
    public static void docFile(List ob,String s){
        ob.clear();
        try{
           ObjectInputStream r=
                new ObjectInputStream(
                 new FileInputStream(s));
           Object o=null;
           while((o=r.readObject())!=null){
               Object o1=(Object)o;
               ob.add(o1);
           }
           r.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
