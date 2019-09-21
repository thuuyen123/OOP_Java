
package ex4;

//nested class
public class Outer {
    private String name;
    public Outer(){}
    public Outer(String name){
        this.name=name;
    }
    
    class Inner{
       private int d,m,y;
       public Inner(){}
       public Inner(int d,int m,int y){
          this.d=d;
          this.m=m;
          this.y=y;
       }
       public int getD(){
           return d;
       }
    }
}
